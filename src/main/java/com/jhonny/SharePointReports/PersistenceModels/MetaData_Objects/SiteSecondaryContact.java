package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteSecondaryContact
{
    @JsonProperty("SecondaryContact")
    private String SecondaryContact;
}