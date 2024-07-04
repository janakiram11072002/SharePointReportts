package com.jhonny.SharePointReports.Utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils 
{
    // static JsonUtils instanse;

    private static final ObjectMapper objectMapper = new ObjectMapper();

    // public static JsonUtils getInstance()
    // {
    //     if(instanse == null)
    //     {
    //         instanse = new JsonUtils();
    //     }
    //     return instanse;
    // }

    public static <T> T toObject(String jsonResponse, Class<T> valueType)
    {
        try
        {
            return objectMapper.readValue(jsonResponse, valueType);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
