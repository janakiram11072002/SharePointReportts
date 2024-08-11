package com.jhonny.SharePointReports.PersistenceModels;

import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.Group;
import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.User;

public class SiteGroups
{
    public int siteType;
    public String siteId;
    public String siteUrl;
    public String siteTitle;
    public String webId;
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
    public int id;
    public boolean isHiddenInUI;
    public String loginName;
    public String title;
    public int principalType;

    public SiteGroups(Web webSource, Group source)
    {
        this.siteType = webSource.siteType;
        this.siteId = webSource.siteId;
        this.siteUrl = webSource.siteUrl;
        this.siteTitle = webSource.siteTitle;
        this.webId = webSource.id;
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
        this.id = source.getId();
        this.isHiddenInUI = source.isHiddenInUI();
        this.loginName = source.getLoginName();
        this.title = source.getTitle();
        this.principalType = source.getPrincipalType();

        try
        {
            for(User user : source.getUserCollection().getUsers())
            {
                SiteGroupMembers groupMembers = new SiteGroupMembers(this, user);
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
