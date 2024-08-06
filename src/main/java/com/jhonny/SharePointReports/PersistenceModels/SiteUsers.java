package com.jhonny.SharePointReports.PersistenceModels;

import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.User;

public class SiteUsers
{
    public int siteType;
    public String siteId;
    public String webId;
    public String email;
    public String groups;
    public boolean isShareByEmailGuestUser;
    public boolean isSiteAdmin;
    public boolean isSiteOwner;
    public String userId_nameId;
    public String userId_nameIdUser;
    public String userId_typeId;
    public int id;
    public boolean isHiddenInUI;
    public String loginName;
    public String title;
    public int principalType;
    public String objectVersion;
    public String webUrl;
    public String webTitle;
    public String siteUrl;
    public String siteTitle;

    public SiteUsers(String siteId, String webId, User source)
    {

    }
}
