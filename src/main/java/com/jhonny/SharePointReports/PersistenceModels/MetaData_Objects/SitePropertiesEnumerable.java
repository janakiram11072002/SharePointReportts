package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.SiteProperties.TenantLevelSiteProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SitePropertiesEnumerable
{
    @JsonProperty("NextStartIndex")
    private int NextStartIndex;
    @JsonProperty("NextStartIndexFromSharePoint")
    private int NextStartIndexFromSharePoint;
    @JsonProperty("_Child_Items_")
    private  TenantLevelSiteProperties[] Sites;

    public int getNextStartIndex() {
        return NextStartIndex;
    }
    public void setNextStartIndex(int nextStartIndex) {
        NextStartIndex = nextStartIndex;
    }
    public int getNextStartIndexFromSharePoint() {
        return NextStartIndexFromSharePoint;
    }
    public void setNextStartIndexFromSharePoint(int nextStartIndexFromSharePoint) {
        NextStartIndexFromSharePoint = nextStartIndexFromSharePoint;
    }
    public TenantLevelSiteProperties[] getSites() {
        return Sites;
    }
    public void setSites(TenantLevelSiteProperties[] Sites) {
        this.Sites = Sites;
    }
}
