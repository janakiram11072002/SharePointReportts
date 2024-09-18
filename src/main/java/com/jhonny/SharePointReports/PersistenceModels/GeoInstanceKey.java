package com.jhonny.SharePointReports.PersistenceModels;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

/**
 * GeoInstanceKey
 */
@Embeddable
public class GeoInstanceKey implements Serializable
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