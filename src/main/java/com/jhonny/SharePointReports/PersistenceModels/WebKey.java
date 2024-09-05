package com.jhonny.SharePointReports.PersistenceModels;

public class WebKey
{
    public String siteId;
    public String id;

    public WebKey()
    {

    }
    public WebKey(String siteId, String id)
    {
        this.siteId = siteId;
        this.id = id;
    }
}
