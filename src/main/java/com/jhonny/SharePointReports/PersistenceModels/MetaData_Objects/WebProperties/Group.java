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

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public boolean isHiddenInUI() {
        return IsHiddenInUI;
    }

    public void setHiddenInUI(boolean hiddenInUI) {
        IsHiddenInUI = hiddenInUI;
    }

    public String getLoginName() {
        return LoginName;
    }

    public void setLoginName(String loginName) {
        LoginName = loginName;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getPrincipalType() {
        return PrincipalType;
    }

    public void setPrincipalType(int principalType) {
        PrincipalType = principalType;
    }

    public boolean isAllowMembersEditMembership() {
        return AllowMembersEditMembership;
    }

    public void setAllowMembersEditMembership(boolean allowMembersEditMembership) {
        AllowMembersEditMembership = allowMembersEditMembership;
    }

    public boolean isAllowRequestToJoinLeave() {
        return AllowRequestToJoinLeave;
    }

    public void setAllowRequestToJoinLeave(boolean allowRequestToJoinLeave) {
        AllowRequestToJoinLeave = allowRequestToJoinLeave;
    }

    public boolean isAutoAcceptRequestToJoinLeave() {
        return AutoAcceptRequestToJoinLeave;
    }

    public void setAutoAcceptRequestToJoinLeave(boolean autoAcceptRequestToJoinLeave) {
        AutoAcceptRequestToJoinLeave = autoAcceptRequestToJoinLeave;
    }

    public boolean isCanCurrentUserEditMembership() {
        return CanCurrentUserEditMembership;
    }

    public void setCanCurrentUserEditMembership(boolean canCurrentUserEditMembership) {
        CanCurrentUserEditMembership = canCurrentUserEditMembership;
    }

    public boolean isCanCurrentUserManageGroup() {
        return CanCurrentUserManageGroup;
    }

    public void setCanCurrentUserManageGroup(boolean canCurrentUserManageGroup) {
        CanCurrentUserManageGroup = canCurrentUserManageGroup;
    }

    public boolean isCanCurrentUserViewMembership() {
        return CanCurrentUserViewMembership;
    }

    public void setCanCurrentUserViewMembership(boolean canCurrentUserViewMembership) {
        CanCurrentUserViewMembership = canCurrentUserViewMembership;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public boolean isOnlyAllowMembersViewMembership() {
        return OnlyAllowMembersViewMembership;
    }

    public void setOnlyAllowMembersViewMembership(boolean onlyAllowMembersViewMembership) {
        OnlyAllowMembersViewMembership = onlyAllowMembersViewMembership;
    }

    public com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.Owner getOwner() {
        return Owner;
    }

    public void setOwner(com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.Owner owner) {
        Owner = owner;
    }

    public String getOwnerTitle() {
        return OwnerTitle;
    }

    public void setOwnerTitle(String ownerTitle) {
        OwnerTitle = ownerTitle;
    }

    public String getRequestToJoinLeaveEmailSetting() {
        return RequestToJoinLeaveEmailSetting;
    }

    public void setRequestToJoinLeaveEmailSetting(String requestToJoinLeaveEmailSetting) {
        RequestToJoinLeaveEmailSetting = requestToJoinLeaveEmailSetting;
    }

    public List<User> getUsers() {
        return Users;
    }

    public void setUsers(List<User> users) {
        Users = users;
    }
}
