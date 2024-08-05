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
    private List<Group> Groups;
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
    private String UserId;
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
}
