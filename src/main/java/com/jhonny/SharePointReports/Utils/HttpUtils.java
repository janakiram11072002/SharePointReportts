package com.jhonny.SharePointReports.Utils;

import java.io.UnsupportedEncodingException;

// import com.microsoft.aad.msal4j.IHttpResponse;
// import okhttp3.MediaType;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class HttpUtils
{
    private HttpClient client;
	
    public HttpUtils()
    {
        client = HttpClient.newHttpClient();
    }

    public HttpResponse<String> Get(String url, String token, Map<String, String> query)
    {
        //HttpClient client = HttpClient.newHttpClient();
        String encodedQuery = buildFormData(query);
        String encodedUrl = encodedQuery.length() > 0 ? url+"?"+encodedQuery : url;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(encodedUrl))
                .header("accept", "application/json")
                //.header("Content-Type","application/x-www-form-urlencoded")
                .header("Authorization", "Bearer "+token)
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
    public HttpResponse<String> Post(String url, Map<String,String> body)
    {
        //HttpClient client = HttpClient.newHttpClient();
        //var headerJson = prepareHeader(header);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("accept", "application/json")
                //.header("Content-Type", "application/json")
                .header("Content-Type","application/x-www-form-urlencoded")
                .POST(HttpRequest.BodyPublishers.ofString(buildFormData(body)))
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
            System.out.println("Error in Post Request");
            throw new RuntimeException();
        }

        return response;
    }

    private static String buildFormData(Map<String, String> data) {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> entry : data.entrySet()) {
            if (builder.length() > 0) {
                builder.append("&");
            }
            try
            {
                builder.append(URLEncoder.encode(entry.getKey(), StandardCharsets.UTF_8.name()));
                builder.append("=");
                builder.append(URLEncoder.encode(entry.getValue(), StandardCharsets.UTF_8.name()));
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        return builder.toString();
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
