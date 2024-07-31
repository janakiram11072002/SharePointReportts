package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.SiteProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User
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
    @JsonProperty("Email")
    private String Email;
    @JsonProperty("Expiration")
    private String Expiration;
    @JsonProperty("IsEmailAuthenticationGuestUser")
    private boolean IsEmailAuthenticationGuestUser;
    @JsonProperty("IsSiteAdmin")
    private boolean IsSiteAdmin;
    @JsonProperty("IsShareByEmailGuestUser")
    private boolean IsShareByEmailGuestUser;
    @JsonProperty("UserPrincipalName")
    private String UserPrincipalName;
    @JsonProperty("UserId")
    private UserId UserId;

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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getExpiration() {
        return Expiration;
    }

    public void setExpiration(String expiration) {
        Expiration = expiration;
    }

    public boolean isEmailAuthenticationGuestUser() {
        return IsEmailAuthenticationGuestUser;
    }

    public void setEmailAuthenticationGuestUser(boolean emailAuthenticationGuestUser) {
        IsEmailAuthenticationGuestUser = emailAuthenticationGuestUser;
    }

    public boolean isSiteAdmin() {
        return IsSiteAdmin;
    }

    public void setSiteAdmin(boolean siteAdmin) {
        IsSiteAdmin = siteAdmin;
    }

    public boolean isShareByEmailGuestUser() {
        return IsShareByEmailGuestUser;
    }

    public void setShareByEmailGuestUser(boolean shareByEmailGuestUser) {
        IsShareByEmailGuestUser = shareByEmailGuestUser;
    }

    public String getUserPrincipalName() {
        return UserPrincipalName;
    }

    public void setUserPrincipalName(String userPrincipalName) {
        UserPrincipalName = userPrincipalName;
    }

    public UserId getUserId() {
        return UserId;
    }

    public void setUserId(UserId userId) {
        UserId = userId;
    }
}

/*
 * User as a Owner
    "Id": 7,
    "IsHiddenInUI": false,
    "LoginName": "i:0#.f|membership|jh@42jghx.onmicrosoft.com",
    "Title": "Jhonny",
    "PrincipalType": 1,
    "Email": "JH@42jghx.onmicrosoft.com",
    "Expiration": "",
    "IsEmailAuthenticationGuestUser": false,
    "IsShareByEmailGuestUser": false,
    "IsSiteAdmin": true,
    "UserId": {
        "NameId": "1003200263675b60",
        "NameIdIssuer": "urn:federation:microsoftonline"
    },
    "UserPrincipalName": "jh@42jghx.onmicrosoft.com"
 * Group as a Owner
    "Id": 6,
    "IsHiddenInUI": false,
    "LoginName": "c:0o.c|federateddirectoryclaimprovider|31956366-7ce7-4b48-9f2c-16553af97d33_o",
    "Title": "1gate Owners",
    "PrincipalType": 4,
    "Email": "1gate@42jghx.onmicrosoft.com",
    "Expiration": "",
    "IsEmailAuthenticationGuestUser": false,
    "IsShareByEmailGuestUser": false,
    "IsSiteAdmin": true,
    "UserId": null,
    "UserPrincipalName": null
 */