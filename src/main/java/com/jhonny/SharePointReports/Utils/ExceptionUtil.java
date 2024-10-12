package com.jhonny.SharePointReports.Utils;

import java.util.function.Supplier;

public class ExceptionUtil 
{

    public static <T> T justTry(Supplier<T> func)//Try with out loggin the error
    {
        try
        {
            return func.get();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
}
