package com.jhonny.SharePointReports.PersistenceModels;

public class SiteGroupKey
{
    public String siteId;
    public String webId;
    public int id;

    public SiteGroupKey()
    {

    }
    public SiteGroupKey(String siteId, String webId, int id)
    {
        this.siteId = siteId;
        this.webId = webId;
        this.id = id;
    }
}
