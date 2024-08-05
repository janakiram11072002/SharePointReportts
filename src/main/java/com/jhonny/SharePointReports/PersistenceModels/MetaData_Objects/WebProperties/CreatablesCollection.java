package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatablesCollection
{
    @JsonProperty("DocumentTemplate")
    private int DocumentTemplate;
    @JsonProperty("FileExtension")
    private String FileExtension;
    @JsonProperty("ItemType")
    private String ItemType;
}
