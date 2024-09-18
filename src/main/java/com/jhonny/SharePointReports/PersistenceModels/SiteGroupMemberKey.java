package com.jhonny.SharePointReports.PersistenceModels;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class SiteGroupMemberKey implements Serializable
{
    public String siteId;
    public String webId;
    public int groupId;
    public int id;

    public SiteGroupMemberKey()
    {

    }
    public SiteGroupMemberKey(String siteId, String webId, int groupId, int id)
    {
        this.siteId = siteId;
        this.webId = webId;
        this.groupId = groupId;
        this.id = id;
    }
}
