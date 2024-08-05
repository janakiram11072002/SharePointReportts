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

}
