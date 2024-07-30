package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.SiteProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SecondaryContact
{
    @JsonProperty("SecondaryContact")
    private String SecondaryContact;

    public String getSecondaryContact() {
        return SecondaryContact;
    }

    public void setSecondaryContact(String secondaryContact) {
        SecondaryContact = secondaryContact;
    }
}