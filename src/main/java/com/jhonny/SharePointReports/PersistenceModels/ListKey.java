package com.jhonny.SharePointReports.PersistenceModels;

public class ListKey {
    public String siteId;
    public String webId;
    public String id;
    public ListKey()
    {

    }
    public ListKey(String siteId, String webId, String id)
    {
        this.siteId = siteId;
        this.webId = webId;
        this.id = id;
    }
}
