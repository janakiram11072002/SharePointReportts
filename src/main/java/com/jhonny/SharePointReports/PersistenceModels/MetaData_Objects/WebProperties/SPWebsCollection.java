package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SPWebsCollection
{
    @JsonProperty("_Child_Items_")
    private Webs[] Webs;

    public Webs[] getWebs() {
        return Webs;
    }

    public void setWebs(Webs[] webs) {
        Webs = webs;
    }
}
