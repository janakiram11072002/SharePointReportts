package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Owner
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
}
