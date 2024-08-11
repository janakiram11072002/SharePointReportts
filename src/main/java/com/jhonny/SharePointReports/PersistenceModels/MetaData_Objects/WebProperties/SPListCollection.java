package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SPListCollection
{
    @JsonProperty("_Child_Items_")
    private SiteList[] Lists;

    public SiteList[] getLists() {
        return Lists;
    }

    public void setLists(SiteList[] lists) {
        Lists = lists;
    }
}
