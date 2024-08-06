package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.GeoInstances;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SPOTenantInstance
{
    @JsonProperty("DataLocation")
    private String DataLocation;
    @JsonProperty("IsDefaultDataLocation")
    private boolean IsDefaultDataLocation;
    @JsonProperty("MySiteHostUrl")
    private String MySiteHostUrl;
    @JsonProperty("PortalUrl")
    private String PortalUrl;
    @JsonProperty("RootSiteUrl")
    private String RootSiteUrl;
    @JsonProperty("TenantAdminUrl")
    private String TenantAdminUrl;

    public String getDataLocation() {
        return DataLocation;
    }

    public void setDataLocation(String dataLocation) {
        DataLocation = dataLocation;
    }

    public boolean isDefaultDataLocation() {
        return IsDefaultDataLocation;
    }

    public void setDefaultDataLocation(boolean defaultDataLocation) {
        IsDefaultDataLocation = defaultDataLocation;
    }

    public String getMySiteHostUrl() {
        return MySiteHostUrl;
    }

    public void setMySiteHostUrl(String mySiteHostUrl) {
        MySiteHostUrl = mySiteHostUrl;
    }

    public String getPortalUrl() {
        return PortalUrl;
    }

    public void setPortalUrl(String portalUrl) {
        PortalUrl = portalUrl;
    }

    public String getRootSiteUrl() {
        return RootSiteUrl;
    }

    public void setRootSiteUrl(String rootSiteUrl) {
        RootSiteUrl = rootSiteUrl;
    }

    public String getTenantAdminUrl() {
        return TenantAdminUrl;
    }

    public void setTenantAdminUrl(String tenantAdminUrl) {
        TenantAdminUrl = tenantAdminUrl;
    }
}
