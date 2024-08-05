package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatablesInfo
{
    @JsonProperty("CanCreateFolders")
    private boolean CanCreateFolders;
    @JsonProperty("CanCreateItems")
    private boolean CanCreateItems;
    @JsonProperty("CanUploadFiles")
    private boolean CanUploadFiles;
    @JsonProperty("CreatablesCollection")
    private List<CreatablesCollection> CreatablesCollection;
}
