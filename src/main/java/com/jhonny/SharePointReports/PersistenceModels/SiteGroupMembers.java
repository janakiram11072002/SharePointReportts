package com.jhonny.SharePointReports.PersistenceModels;

import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.User;

public class SiteGroupMembers
{
    public int siteType;
    public String siteId;
    public String siteUrl;
    public String siteTitle;
    public String webId;
    public String webUrl;
    public String webTitle;
    public int groupId;
    public String groupTitle;
    public int id;
    public String title;
    public String email;
    public String loginName;
    public String domainName;
    public boolean isExternalUser;
    public boolean isSystemAccount;
    public boolean isSiteAdmin;
    public boolean isOwner;
    public boolean isSiteMember;
    public boolean isSiteVisitor;
    public int principalType;

//    public SiteGroupMembers()
//    {
//
//    }
    public SiteGroupMembers(SiteGroups groupSource, User source)
    {
        this.siteType = groupSource.siteType;
        this.siteId = groupSource.siteId;
        this.siteUrl = groupSource.siteUrl;
        this.siteTitle = groupSource.siteTitle;
        this.webId = groupSource.webId;
        this.webUrl = groupSource.webUrl;
        this.webTitle = groupSource.webTitle;
        this.groupId = groupSource.id;
        this.groupTitle = groupSource.title;
        this.id = source.getId();
        this.title = source.getTitle();
        this.email = source.getEmail();
        this.loginName = source.getLoginName();
//        this.domainName = source.;
//        this.isExternalUser = source;
//        this.isSystemAccount = source;
        this.isSiteAdmin = source.isSiteAdmin();
//        this.isOwner = source;
//        this.isSiteMember = source;
//        this.isSiteVisitor = source;
//        this.principalType = source;
    }
}
