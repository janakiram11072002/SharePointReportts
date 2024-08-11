package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatablesCollection
{
    @JsonProperty("_Child_Items_")
    private CreatablesItemInfo[] ChildItems;

    public CreatablesItemInfo[] getChildItems() {
        return ChildItems;
    }

    public void setChildItems(CreatablesItemInfo[] childItems) {
        ChildItems = childItems;
    }
}
