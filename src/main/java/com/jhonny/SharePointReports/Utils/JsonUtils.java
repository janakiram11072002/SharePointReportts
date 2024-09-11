package com.jhonny.SharePointReports.Utils;

// import com.fasterxml.jackson.core.JsonProcessingException;
// import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

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
            //System.out.println(jsonResponse);
            return objectMapper.readValue(jsonResponse, valueType);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static String getDataFromJson(String jsonResponse, int location)
    {
        // import org.json
        try {
            // Parse the JSON response
            JsonNode rootNode = objectMapper.readTree(jsonResponse);

            // Print the extracted data
            return objectMapper
                    //.writerWithDefaultPrettyPrinter()
                    .writeValueAsString(rootNode.get(location));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
