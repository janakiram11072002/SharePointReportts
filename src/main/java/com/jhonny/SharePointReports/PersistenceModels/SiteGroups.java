package com.jhonny.SharePointReports.PersistenceModels;

import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.Group;

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

    public SiteGroups(String siteId, String WebId, Group source)
    {

    }
}
