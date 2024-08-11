package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User
{
    @JsonProperty("Id")
    private int Id;
    @JsonProperty("EmailWithFallback")
    private String EmailWithFallback;
    @JsonProperty("HexCid")
    private String HexCid;
    @JsonProperty("Groups")
    private SPGroupCollection GroupCollection;
    @JsonProperty("Email")
    private String Email;
    @JsonProperty("IsSiteAdmin")
    private boolean IsSiteAdmin;
    @JsonProperty("LoginName")
    private String LoginName;
    @JsonProperty("Title")
    private String Title;
    @JsonProperty("PrincipalType")
    private int PrincipalType;
    @JsonProperty("UserId")
    private UserId UserId;
    @JsonProperty("UserPrincipalName")
    private String UserPrincipalName;
    @JsonProperty("IsEmailAuthenticationGuestUser")
    private boolean IsEmailAuthenticationGuestUser;
    @JsonProperty("IsHiddenInUI")
    private boolean IsHiddenInUI;
    @JsonProperty("IsShareByEmailGuestUser")
    private boolean IsShareByEmailGuestUser;
    @JsonProperty("Expiration")
    private String Expiration;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getEmailWithFallback() {
        return EmailWithFallback;
    }

    public void setEmailWithFallback(String emailWithFallback) {
        EmailWithFallback = emailWithFallback;
    }

    public String getHexCid() {
        return HexCid;
    }

    public void setHexCid(String hexCid) {
        HexCid = hexCid;
    }

    public SPGroupCollection getGroupCollection() {
        return GroupCollection;
    }

    public void setGroupCollection(SPGroupCollection groupCollection) {
        GroupCollection = groupCollection;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public boolean isSiteAdmin() {
        return IsSiteAdmin;
    }

    public void setSiteAdmin(boolean siteAdmin) {
        IsSiteAdmin = siteAdmin;
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

    public com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.UserId getUserId() {
        return UserId;
    }

    public void setUserId(com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.UserId userId) {
        UserId = userId;
    }

    public String getUserPrincipalName() {
        return UserPrincipalName;
    }

    public void setUserPrincipalName(String userPrincipalName) {
        UserPrincipalName = userPrincipalName;
    }

    public boolean isEmailAuthenticationGuestUser() {
        return IsEmailAuthenticationGuestUser;
    }

    public void setEmailAuthenticationGuestUser(boolean emailAuthenticationGuestUser) {
        IsEmailAuthenticationGuestUser = emailAuthenticationGuestUser;
    }

    public boolean isHiddenInUI() {
        return IsHiddenInUI;
    }

    public void setHiddenInUI(boolean hiddenInUI) {
        IsHiddenInUI = hiddenInUI;
    }

    public boolean isShareByEmailGuestUser() {
        return IsShareByEmailGuestUser;
    }

    public void setShareByEmailGuestUser(boolean shareByEmailGuestUser) {
        IsShareByEmailGuestUser = shareByEmailGuestUser;
    }

    public String getExpiration() {
        return Expiration;
    }

    public void setExpiration(String expiration) {
        Expiration = expiration;
    }
}
