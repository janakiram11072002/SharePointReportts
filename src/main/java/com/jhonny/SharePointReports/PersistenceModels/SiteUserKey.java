package com.jhonny.SharePointReports.PersistenceModels;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class SiteUserKey implements Serializable
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
