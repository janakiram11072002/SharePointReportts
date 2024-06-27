package com.jhonny.SharePointReports.Utils;

// import com.microsoft.aad.msal4j.IHttpResponse;
// import okhttp3.MediaType;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class HttpUtils
{
    private HttpClient client;
	
    public HttpUtils()
    {
        client = HttpClient.newHttpClient();
    }

    public HttpResponse<String> Get(String url)
    {
        //HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("accept", "application/json")
                .build();
        HttpResponse<String> response = null;
        try
        {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if(response.statusCode() != 200)
            {
                System.out.println("This request not a success. Status code = "+response.statusCode());
                return  null;
            }
        }
        catch (Exception e)
        {
            System.out.println("Error While in Get Request");
            throw new RuntimeException();
        }
        return response;

    }

    /// *Summary*
    //
    // Since the body json is not able to change from string to charset
    //
    // /
    public HttpResponse<String> Post(String url, /*HashMap<String, String> header,*/ String body)
    {
        //HttpClient client = HttpClient.newHttpClient();
        //var headerJson = prepareHeader(header);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();

        HttpResponse<String> response = null;
        //MediaType mediaType = MediaType.parse("application/json");


        try
        {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            //System.out.println("Status Code = " + response.statusCode());
            if(response.statusCode() != 200)
            {
                System.out.println("This request is not a success. Status code = "+response.statusCode());
                return  null;
            }
        }
        catch (Exception e)
        {
            System.out.println("Erroe in Post Request");
            throw new RuntimeException();
        }

        return response;
    }

    private String prepareHeader(HashMap<String, String> headers)
    {
        if(headers == null) return "{}";
        String header = "{";
        for(Map.Entry<String,String> item : headers.entrySet())
        {
            header+="\""+item.getKey()+"\",\""+item.getValue()+"\"";
        }
        header += "}";
        return header;
    }

}
