package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Group
{

    @JsonProperty("Id")
    private int Id;
    @JsonProperty("IsHiddenInUI")
    private boolean IsHiddenInUI;
    @JsonProperty("LoginName")
    private String LoginName;
    @JsonProperty("Title")
    private String Title;
    @JsonProperty("PrincipalType")
    private int PrincipalType;
    @JsonProperty("AllowMembersEditMembership")
    private boolean AllowMembersEditMembership;
    @JsonProperty("AllowRequestToJoinLeave")
    private boolean AllowRequestToJoinLeave;
    @JsonProperty("AutoAcceptRequestToJoinLeave")
    private boolean AutoAcceptRequestToJoinLeave;
    @JsonProperty("CanCurrentUserEditMembership")
    private boolean CanCurrentUserEditMembership;
    @JsonProperty("CanCurrentUserManageGroup")
    private boolean CanCurrentUserManageGroup;
    @JsonProperty("CanCurrentUserViewMembership")
    private boolean CanCurrentUserViewMembership;
    @JsonProperty("Description")
    private String Description;
    @JsonProperty("OnlyAllowMembersViewMembership")
    private boolean OnlyAllowMembersViewMembership;
    @JsonProperty("Owner")
    private Owner Owner;
    @JsonProperty("OwnerTitle")
    private String OwnerTitle;
    @JsonProperty("RequestToJoinLeaveEmailSetting")
    private String RequestToJoinLeaveEmailSetting;
    @JsonProperty("Users")
    private List<User> Users;

}
