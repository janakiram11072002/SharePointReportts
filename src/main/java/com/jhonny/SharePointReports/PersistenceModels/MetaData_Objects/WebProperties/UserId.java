package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserId
{
    @JsonProperty("NameId")
    private String NameId;
    @JsonProperty("NameIdIssuer")
    private String NameIdIssuer;
    @JsonProperty("TypeId")
    private String TypeId;

    public String getNameId() {
        return NameId;
    }

    public void setNameId(String nameId) {
        NameId = nameId;
    }

    public String getNameIdIssuer() {
        return NameIdIssuer;
    }

    public void setNameIdIssuer(String nameIdIssuer) {
        NameIdIssuer = nameIdIssuer;
    }

    public String getTypeId() {
        return TypeId;
    }

    public void setTypeId(String typeId) {
        TypeId = typeId;
    }
}

/*
    "UserId": {
        "NameId": "1003200263675b60",
        "NameIdIssuer": "urn:federation:microsoftonline"
    },
 */

