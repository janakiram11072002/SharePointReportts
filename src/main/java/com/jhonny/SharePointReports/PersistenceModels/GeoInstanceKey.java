package com.jhonny.SharePointReports.PersistenceModels;

/**
 * GeoInstanceKey
 */
public class GeoInstanceKey 
{
    public String dataLocation;
    public String tenantAdminUrl;    
    public GeoInstanceKey()
    {

    }
    public GeoInstanceKey(String dataLocation, String tenantAdminUrl)
    {
        this.dataLocation = dataLocation;
        this.tenantAdminUrl = tenantAdminUrl;
    }
}