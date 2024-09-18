package com.jhonny.SharePointReports.PersistenceModels;

import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.GeoInstances.SPOTenantInstance;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "geo_instances")
public class GeoInstances
{
    // public String dataLocation;
    // public String tenantAdminUrl;
    @EmbeddedId
    public GeoInstanceKey key;
    public boolean isDefaultDataLocation;
    public String mySiteHostUrl;
    public String portalUrl;
    public String rootSiteUrl;
    public int siteCollections;
    public int sites;
    //public int geosize;
    public GeoInstances()
    {

    }
    public GeoInstances(SPOTenantInstance source)
    {
        this.key = new GeoInstanceKey(source.getDataLocation(), source.getTenantAdminUrl());
        // this.dataLocation = source.getDataLocation();
        this.isDefaultDataLocation = source.isDefaultDataLocation();
        this.mySiteHostUrl = source.getMySiteHostUrl();
        this.portalUrl = source.getPortalUrl();
        this.rootSiteUrl = source.getRootSiteUrl();
        // this.tenantAdminUrl = source.getTenantAdminUrl();
    }
    public void updateSite(int Sites)
    {
        this.siteCollections = Sites;
    }
    public void updateWeb(int Webs)
    {
        this.sites = Webs;
    }

}
