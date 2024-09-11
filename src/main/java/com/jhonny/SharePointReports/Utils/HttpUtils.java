package com.jhonny.SharePointReports.Utils;

// import java.io.UnsupportedEncodingException;

// import com.microsoft.aad.msal4j.IHttpResponse;
// import okhttp3.MediaType;

import java.net.URI;
// import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
// import java.nio.charset.StandardCharsets;
// import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.jhonny.SharePointReports.Utils.CustomUtils.buildFormData;

public class HttpUtils
{
    private static HttpClient client = HttpClient.newHttpClient();
	
//    public HttpUtils()
//    {
//        client ;
//    }

    public static HttpResponse<String> Get(String url, String token, Map<String, String> query)
    {
        //HttpClient client = HttpClient.newHttpClient();
        String encodedQuery = buildFormData(query);
        String encodedUrl = encodedQuery.length() > 0 ? url+"?"+encodedQuery : url;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(encodedUrl))
                .setHeader("Accept", "application/json;odata=nometadata")
                .setHeader("Content-Type", "application/json;odata=verbose")
                //.header("Content-Type","application/x-www-form-urlencoded")
                .setHeader("Authorization", "Bearer "+token)
                .build();
        // HttpResponse<String> response = null;
//        try
//        {
//            response = client.send(request, HttpResponse.BodyHandlers.ofString());
//            if(response.statusCode() != 200)
//            {
//                System.out.println("This request not a success. Status code = "+response.statusCode());
//                return  null;
//            }
//        }
//        catch (Exception e)
//        {
//            System.out.println("Error While in Get Request\n"+e.getMessage());
//
//            throw new RuntimeException();
//        }
//        return response;
        return sendRequestWithRetry(request);
    }

    /// *Summary*
    //
    // Since the body json is not able to change from string to charset
    //
    // /
    public static HttpResponse<String> Post(String url, Map<String,String> body)
    {
        //HttpClient client = HttpClient.newHttpClient();
        //var headerJson = prepareHeader(header);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("accept", "application/json;odata=verbose")
                //.header("Content-Type", "application/json")
                .header("Content-Type","application/x-www-form-urlencoded")
                .POST(HttpRequest.BodyPublishers.ofString(buildFormData(body)))
                .build();

        //HttpResponse<String> response = null;
        //MediaType mediaType = MediaType.parse("application/json");


//        try
//        {
//            response = client.send(request, HttpResponse.BodyHandlers.ofString());
//            //System.out.println("Status Code = " + response.statusCode());
//            if(response.statusCode() != 200)
//            {
//                System.out.println("This request is not a success. Status code = "+response.statusCode());
//                return  null;
//            }
//        }
//        catch (Exception e)
//        {
//            System.out.println("Error in Post Request\n"+e.getMessage());
//            throw new RuntimeException();
//        }
//
//        return response;
        return sendRequestWithRetry(request);
    }

    public static HttpResponse<String> PostAsXML(String url,String token ,String body)
    {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .setHeader("accept", "application/json;odata=nomedata")
                //.header("Content-Type", "application/json")
                .setHeader("Content-Type","text/xml")
                //.setHeader("Accept-Encoding","gzip,deflate")
                .setHeader("Authorization", "Bearer "+token)
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();

//        HttpResponse<String> response = null;
//        try
//        {
//            response = client.send(request, HttpResponse.BodyHandlers.ofString());
//            if(response.statusCode() != 200)
//            {
//                System.out.println("This request is not a success. Status code = "+response.statusCode());
//                return  null;
//            }
//        }
//        catch (Exception e)
//        {
//            System.out.println("Error in Post Request\n"+e.getMessage());
//            throw new RuntimeException();
//        }
//        return response;
        return sendRequestWithRetry(request);
    }

    private static final int MAX_RETRY_LIMIT = 4; // Max retries before considering a new HttpClient
    private static final int MAX_RETRY_BEFORE_NEW_CLIENT = 3;

    public static HttpResponse<String> sendRequestWithRetry(HttpRequest request)
    {
        int currentRetry = 1;
        long delay = 1000;

        HttpResponse<String> response = null;
        try
        {
            response = client.send(request,HttpResponse.BodyHandlers.ofString());

            if(response.statusCode() == 200) return response;

            else if(response.statusCode() == 429) //Limit reached
            {
                long retryAfterSeconds = Integer.parseInt(response.headers().firstValue("Retry-After").orElse("60"));
                TimeUnit.SECONDS.sleep(retryAfterSeconds);
                response = client.send(request,HttpResponse.BodyHandlers.ofString());
                if(response.statusCode() == 200) return response;
            }

            else if(response.statusCode() == 503 || response.statusCode() == 504)
            {
                System.out.println("Service Unavailable. Retrying after"+(delay)+"ms ........");
                while(currentRetry < MAX_RETRY_LIMIT)
                {
                    if(currentRetry >= MAX_RETRY_BEFORE_NEW_CLIENT)
                    {
                        client = HttpClient.newHttpClient();;
                    }
                    response = client.send(request,HttpResponse.BodyHandlers.ofString());

                    if(response.statusCode() == 200) return response;

                    TimeUnit.MILLISECONDS.sleep(delay);
                    delay *= 2;
                    currentRetry++;
                }
            }
//            if(response.statusCode() == 503 || response.statusCode() == 429)
//            {
//
//                if(response.statusCode() != 200) throw new Exception();
//            }
            else
            {
                System.out.println(request.uri() +" has failed with status code = "+ (int)response.statusCode()+" ("+response.statusCode()+")");
                return response;
            }
        }
        catch(Exception e)
        {
            currentRetry++;
            if(currentRetry >= MAX_RETRY_LIMIT) throw new RuntimeException(e);
        }
        throw new RuntimeException("Exceeded maximum retries");
    }
}
