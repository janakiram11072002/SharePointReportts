package com.jhonny.SharePointReports.Utils;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomUtils
{
    public static String prepareHeader(HashMap<String, String> headers)
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

    public static String buildFormData(Map<String, String> data)
    {
        if(data == null || data.size()==0) return "";
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> entry : data.entrySet()) {
            if (builder.length() > 0) {
                builder.append("&");
            }
            try
            {
//                builder.append("$");
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

    public static Date toDate(String data)
    {
        try
        {
            Pattern pattern = Pattern.compile("/Date\\((\\d+),(\\d+),(\\d+),(\\d+),(\\d+),(\\d+),(\\d+)\\)/");
            Matcher matcher = pattern.matcher(data);

            if(matcher.matches())
            {
                Calendar calender = Calendar.getInstance();
                calender.set(Calendar.YEAR,Integer.parseInt(matcher.group(1)));
                calender.set(Calendar.MONTH,Integer.parseInt(matcher.group(2)));
                calender.set(Calendar.DAY_OF_MONTH,Integer.parseInt(matcher.group(3)));
                calender.set(Calendar.HOUR_OF_DAY,Integer.parseInt(matcher.group(4)));
                calender.set(Calendar.MINUTE,Integer.parseInt(matcher.group(5)));
                calender.set(Calendar.SECOND,Integer.parseInt(matcher.group(6)));
                calender.set(Calendar.MILLISECOND,Integer.parseInt(matcher.group(7)));

                return calender.getTime();
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        return new Date(0);
    }
    public static Date toDateFromInt(String data)
    {
        try
        {
            long timestamp = Long.parseLong(data.replaceAll("[^0-9]", ""));
            // Convert the timestamp to a Date object
            return new Date(timestamp);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public static String toGuid(String data)
    {
        // data = "\/Guid(0000000-0000-0000-0000-000000000000)\/"
        // if(data.length() > 0)
        // {
        //     data = data.replace("\\/Guid(", "");
        //     data = data.replace(")\\/", "");
        // }
        // return data;

        if(data!=null && data.length() > 0)
        {
            return data.substring(data.indexOf("id(")+3, data.indexOf(")")-1 );
        }
        return "";
    }
}
