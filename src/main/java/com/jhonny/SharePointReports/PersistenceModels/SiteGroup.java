package com.jhonny.SharePointReports.PersistenceModels;

import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.Group;

public class SiteGroup
{
//    public String siteId;
//    public String webId;
//    public int id;

    public SiteGroupKey key;

    public int siteType;
    public String siteUrl;
    public String siteTitle;
    public String webUrl;
    public String webTitle;
    public boolean allowMembersEditMembership;
    public boolean allowRequestToJoinLeave;
    public boolean autoAcceptRequestToJoinLeave;
    public boolean canCurrentUserEditMembership;
    public boolean canCurrentUserManageGroup;
    public boolean canCurrentUserViewMembership;
    public String description;
    public boolean onlyAllowMembersViewMembership;
    public String ownerTitle;
    public String requestToJoinLeaveEmailSetting;
    public int memberCount;
    public boolean isHiddenInUI;
    public String loginName;
    public String title;
    public int principalType;

    public SiteGroup()
    {

    }
    public SiteGroup(Web webSource, Group source)
    {

//        this.siteId = webSource.siteId;
//        this.webId = webSource.id;
//        this.id = source.getId();

        this.key = new SiteGroupKey(webSource.key.siteId, webSource.key.id, source.getId());

        this.siteType = webSource.siteType;
        this.siteUrl = webSource.siteUrl;
        this.siteTitle = webSource.siteTitle;
        this.webUrl = webSource.url;
        this.webTitle = webSource.title;
        this.allowMembersEditMembership = source.isAllowMembersEditMembership();
        this.allowRequestToJoinLeave = source.isAllowRequestToJoinLeave();
        this.autoAcceptRequestToJoinLeave = source.isAutoAcceptRequestToJoinLeave();
        this.canCurrentUserEditMembership = source.isCanCurrentUserEditMembership();
        this.canCurrentUserManageGroup = source.isCanCurrentUserManageGroup();
        this.canCurrentUserViewMembership = source.isCanCurrentUserViewMembership();
        this.description = source.getDescription();
        this.onlyAllowMembersViewMembership = source.isOnlyAllowMembersViewMembership();
        this.ownerTitle = source.getOwnerTitle();
        this.requestToJoinLeaveEmailSetting = source.getRequestToJoinLeaveEmailSetting();
        try {
            this.memberCount = source.getUserCollection().getUsers().length;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        this.isHiddenInUI = source.isHiddenInUI();
        this.loginName = source.getLoginName();
        this.title = source.getTitle();
        this.principalType = source.getPrincipalType();

        // boolean isSiteOwner = false;
        // boolean isSiteMember = false;
        // boolean  isSiteVisitor = false;

        // isSiteOwner = webSource.Associated
        // try
        // {
        //     for(User user : source.getUserCollection().getUsers())
        //     {
        //         SiteGroupMembers groupMembers = new SiteGroupMembers(this, user);
        //     }
        // }
        // catch (Exception e)
        // {
        //     System.out.println(e.getMessage());
        // }
    }
}
