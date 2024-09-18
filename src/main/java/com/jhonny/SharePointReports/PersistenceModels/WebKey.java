package com.jhonny.SharePointReports.PersistenceModels;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class WebKey implements Serializable
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
