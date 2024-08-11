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
    private CreatablesCollection CreatablesCollection;

    public boolean isCanCreateFolders() {
        return CanCreateFolders;
    }

    public void setCanCreateFolders(boolean canCreateFolders) {
        CanCreateFolders = canCreateFolders;
    }

    public boolean isCanCreateItems() {
        return CanCreateItems;
    }

    public void setCanCreateItems(boolean canCreateItems) {
        CanCreateItems = canCreateItems;
    }

    public boolean isCanUploadFiles() {
        return CanUploadFiles;
    }

    public void setCanUploadFiles(boolean canUploadFiles) {
        CanUploadFiles = canUploadFiles;
    }

    public com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.CreatablesCollection getCreatablesCollection() {
        return CreatablesCollection;
    }

    public void setCreatablesCollection(com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.CreatablesCollection creatablesCollection) {
        CreatablesCollection = creatablesCollection;
    }
}
