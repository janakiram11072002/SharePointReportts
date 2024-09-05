package com.jhonny.SharePointReports.PersistenceModels;

import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.User;

public class SiteGroupMember
{
//    public String siteId;
//    public String webId;
//    public int groupId;
//    public int id;
    public SiteGroupMemberKey key;
    public int siteType;
    public String siteUrl;
    public String siteTitle;
    public String webUrl;
    public String webTitle;
    public String groupTitle;
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

    public SiteGroupMember()
    {

    }
    public SiteGroupMember(SiteGroup groupSource, User source, boolean isSiteOwner, boolean isSiteMember, boolean isSiteVisitor)
    {
//        this.siteId = groupSource.siteId;
//        this.webId = groupSource.webId;
//        this.groupId = groupSource.id;
//        this.id = source.getId();

        this.key = new SiteGroupMemberKey(groupSource.key.siteId, groupSource.key.webId, groupSource.key.id, source.getId());

        this.siteType = groupSource.siteType;
        this.siteUrl = groupSource.siteUrl;
        this.siteTitle = groupSource.siteTitle;
        this.webUrl = groupSource.webUrl;
        this.webTitle = groupSource.webTitle;
        this.groupTitle = groupSource.title;
        this.title = source.getTitle();
        this.email = source.getEmail();
        this.loginName = source.getLoginName();
//        this.domainName = source.;
//        this.isExternalUser = source;
//        this.isSystemAccount = source;
        this.isSiteAdmin = source.isSiteAdmin();
       this.isOwner = isSiteOwner;
       this.isSiteMember = isSiteMember;
       this.isSiteVisitor = isSiteVisitor;
       this.principalType = source.getPrincipalType();
    }
}
