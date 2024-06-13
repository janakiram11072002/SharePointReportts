package com.jhonny.SharePointReports.Utils;

import com.microsoft.aad.msal4j.IHttpResponse;

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

    public HttpResponse<String> GetMethod(String url)
    {
        //HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("url"))
                .header("accept", "application/json")
                .build();
        HttpResponse<String> response = null;
        try
        {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        }
        catch (Exception e)
        {
            System.out.println("Error While in Get Request");
            throw new RuntimeException();
        }
        return response;

    }

    public HttpResponse<String> PostRequest(String url, HashMap<String, String> header)
    {
        //HttpClient client = HttpClient.newHttpClient();
        var headerJson = prepareHeader(header);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("accept", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(headerJson))
                .build();

        HttpResponse<String> response = null;

        try
        {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
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
        String header = "{";
        for(Map.Entry item : headers.entrySet())
        {
            header+="\""+item.getKey()+"\",\""+item.getValue()+"\"";
        }
        header += "}";
        return header;
    }

}
