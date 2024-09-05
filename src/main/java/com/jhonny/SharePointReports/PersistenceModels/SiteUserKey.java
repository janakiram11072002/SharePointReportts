package com.jhonny.SharePointReports.PersistenceModels;

public class SiteUserKey
{
    public String siteId;
    public String webId;
    public int id;

    public SiteUserKey()
    {

    }
    public SiteUserKey(String siteId, String webId, int id)
    {
        this.siteId = siteId;
        this.webId = webId;
        this.id = id;
    }
}
