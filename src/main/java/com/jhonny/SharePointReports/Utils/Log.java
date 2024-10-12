package com.jhonny.SharePointReports.Utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log 
{
    
    private static final Logger logger = LoggerFactory.getLogger(Log.class);

    private Log()
    {

    }

    public static void Info(String message)
    {
        logger.info(message);
    }
    public static void Debug(String message)
    {
        logger.debug(message);
    }
    public static void Error (String message)
    {
        logger.error(message);
    }
    public static void Warn(String message)
    {
        logger.error(message);
    }
    public static void Trace(String message)
    {
        logger.trace(message);
    }
}
