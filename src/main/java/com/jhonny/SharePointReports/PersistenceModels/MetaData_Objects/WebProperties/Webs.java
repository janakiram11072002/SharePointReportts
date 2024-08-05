package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Webs
{
    @JsonProperty("Url")
    private String Url;
    @JsonProperty("Id")
    private String Id;
    @JsonProperty("Title")
    private String Title;
}
