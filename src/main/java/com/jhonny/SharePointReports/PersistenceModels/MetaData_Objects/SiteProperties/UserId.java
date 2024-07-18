package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.SiteProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserId
{
    @JsonProperty("NameId")
    private String NameId;
    @JsonProperty("NameIdIssuer")
    private String NameIdIssuer;
}

/*
    "UserId": {
        "NameId": "1003200263675b60",
        "NameIdIssuer": "urn:federation:microsoftonline"
    },
 */

