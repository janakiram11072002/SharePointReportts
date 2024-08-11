package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebInformation
{
    @JsonProperty("Configuration")
    private int Configuration;
    @JsonProperty("Created")
    private String Created;
    @JsonProperty("Description")
    private String Description;
    @JsonProperty("Id")
    private String Id;
    @JsonProperty("Language")
    private int Language;
    @JsonProperty("LastItemModifiedDate")
    private String LastItemModifiedDate;
    @JsonProperty("LastItemUserModifiedDate")
    private String LastItemUserModifiedDate;
    @JsonProperty("ServerRelativeUrl")
    private String ServerRelativeUrl;
    @JsonProperty("Title")
    private String Title;
    @JsonProperty("WebTemplate")
    private String WebTemplate;
    @JsonProperty("WebTemplateId")
    private int WebTemplateId;

    public int getConfiguration() {
        return Configuration;
    }

    public void setConfiguration(int configuration) {
        Configuration = configuration;
    }

    public String getCreated() {
        return Created;
    }

    public void setCreated(String created) {
        Created = created;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public int getLanguage() {
        return Language;
    }

    public void setLanguage(int language) {
        Language = language;
    }

    public String getLastItemModifiedDate() {
        return LastItemModifiedDate;
    }

    public void setLastItemModifiedDate(String lastItemModifiedDate) {
        LastItemModifiedDate = lastItemModifiedDate;
    }

    public String getLastItemUserModifiedDate() {
        return LastItemUserModifiedDate;
    }

    public void setLastItemUserModifiedDate(String lastItemUserModifiedDate) {
        LastItemUserModifiedDate = lastItemUserModifiedDate;
    }

    public String getServerRelativeUrl() {
        return ServerRelativeUrl;
    }

    public void setServerRelativeUrl(String serverRelativeUrl) {
        ServerRelativeUrl = serverRelativeUrl;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getWebTemplate() {
        return WebTemplate;
    }

    public void setWebTemplate(String webTemplate) {
        WebTemplate = webTemplate;
    }

    public int getWebTemplateId() {
        return WebTemplateId;
    }

    public void setWebTemplateId(int webTemplateId) {
        WebTemplateId = webTemplateId;
    }
}
