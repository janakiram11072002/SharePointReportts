package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RootFolder
{
    @JsonProperty("Exists")
    private boolean Exists;
    @JsonProperty("ExistsAllowThrowForPolicyFailures")
    private boolean ExistsAllowThrowForPolicyFailures;
    @JsonProperty("ExistsWithException")
    private boolean ExistsWithException;
    @JsonProperty("IsWOPIEnabled")
    private boolean IsWOPIEnabled;
    @JsonProperty("ItemCount")
    private int ItemCount;
    @JsonProperty("Name")
    private String Name;
    @JsonProperty("ProgID")
    private String ProgID;
    @JsonProperty("ServerRelativeUrl")
    private String ServerRelativeUrl;
    @JsonProperty("TimeCreated")
    private String TimeCreated;
    @JsonProperty("TimeLastModified")
    private String TimeLastModified;
    @JsonProperty("UniqueId")
    private String UniqueId;
    @JsonProperty("WelcomePage")
    private String WelcomePage;

    public boolean isExists() {
        return Exists;
    }

    public void setExists(boolean exists) {
        Exists = exists;
    }

    public boolean isExistsAllowThrowForPolicyFailures() {
        return ExistsAllowThrowForPolicyFailures;
    }

    public void setExistsAllowThrowForPolicyFailures(boolean existsAllowThrowForPolicyFailures) {
        ExistsAllowThrowForPolicyFailures = existsAllowThrowForPolicyFailures;
    }

    public boolean isExistsWithException() {
        return ExistsWithException;
    }

    public void setExistsWithException(boolean existsWithException) {
        ExistsWithException = existsWithException;
    }

    public boolean isWOPIEnabled() {
        return IsWOPIEnabled;
    }

    public void setWOPIEnabled(boolean WOPIEnabled) {
        IsWOPIEnabled = WOPIEnabled;
    }

    public int getItemCount() {
        return ItemCount;
    }

    public void setItemCount(int itemCount) {
        ItemCount = itemCount;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getProgID() {
        return ProgID;
    }

    public void setProgID(String progID) {
        ProgID = progID;
    }

    public String getServerRelativeUrl() {
        return ServerRelativeUrl;
    }

    public void setServerRelativeUrl(String serverRelativeUrl) {
        ServerRelativeUrl = serverRelativeUrl;
    }

    public String getTimeCreated() {
        return TimeCreated;
    }

    public void setTimeCreated(String timeCreated) {
        TimeCreated = timeCreated;
    }

    public String getTimeLastModified() {
        return TimeLastModified;
    }

    public void setTimeLastModified(String timeLastModified) {
        TimeLastModified = timeLastModified;
    }

    public String getUniqueId() {
        return UniqueId;
    }

    public void setUniqueId(String uniqueId) {
        UniqueId = uniqueId;
    }

    public String getWelcomePage() {
        return WelcomePage;
    }

    public void setWelcomePage(String welcomePage) {
        WelcomePage = welcomePage;
    }
}
