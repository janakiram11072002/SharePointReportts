package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatablesItemInfo
{
    @JsonProperty("DocumentTemplate")
    private int DocumentTemplate;
    @JsonProperty("FileExtension")
    private String FileExtension;
    @JsonProperty("ItemType")
    private String ItemType;

    public int getDocumentTemplate() {
        return DocumentTemplate;
    }

    public void setDocumentTemplate(int documentTemplate) {
        DocumentTemplate = documentTemplate;
    }

    public String getFileExtension() {
        return FileExtension;
    }

    public void setFileExtension(String fileExtension) {
        FileExtension = fileExtension;
    }

    public String getItemType() {
        return ItemType;
    }

    public void setItemType(String itemType) {
        ItemType = itemType;
    }
}
