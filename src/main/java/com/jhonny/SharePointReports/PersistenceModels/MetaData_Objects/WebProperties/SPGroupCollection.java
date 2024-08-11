package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SPGroupCollection
{
    @JsonProperty("_Child_Items_")
    private Group[] Groups;

    public Group[] getGroups() {
        return Groups;
    }

    public void setGroups(Group[] groups) {
        Groups = groups;
    }

}