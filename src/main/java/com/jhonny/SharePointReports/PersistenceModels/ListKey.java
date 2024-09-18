package com.jhonny.SharePointReports.PersistenceModels;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class ListKey implements Serializable
{
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
