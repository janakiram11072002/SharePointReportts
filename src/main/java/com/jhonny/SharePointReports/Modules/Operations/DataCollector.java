package com.jhonny.SharePointReports.Modules.Operations;

import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.SiteProperties.*;
import com.jhonny.SharePointReports.PersistenceModels.Site;
import com.jhonny.SharePointReports.Utils.AuthClient;
import com.jhonny.SharePointReports.Utils.HttpUtils;
import com.jhonny.SharePointReports.Utils.JsonUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.Cell;
import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.Row;
import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.SiteUrlFromAdmin;
import com.jhonny.SharePointReports.Utils.AppConfig;

import java.net.http.HttpClient;
import java.util.HashMap;
import java.util.Map;

public class DataCollector
{
    private AppConfig appConfig;
    
    public DataCollector()
    {
        this.appConfig = new AnnotationConfigApplicationContext(AppConfig.class).getBean(AppConfig.class);

    }

    public void initilize()
    {
        getAllSitesFromAdmin();
    }
    /**
     * to get all sites under admin site in single command
     * "https://42jghx-admin.sharepoint.com/_api/search/query
     *      ?querytext='(contentclass:STS_Site) (contentclass:STS_Web)'
     *      &trimduplicates=false&selectproperties='Title,Url,Path,ParentLink'
     *      &RowLimit=500&startrow=12400 "
     */
    final String api = "" ;
    private String prepareAdminQuery()
    {
        return null;
    }
    private void getAllSitesFromAdmin()
    {
        String url =appConfig.getTenantAdminSite()+"/_api/search/query";
        int currentRow=0, end=0;
        do
        {
            String response = new HttpUtils().Get(url, new AuthClient().GetAdminToken(), prepAdminSiteBody(currentRow)).body();
            SiteUrlFromAdmin sites = JsonUtils.toObject(response, SiteUrlFromAdmin.class);
            for(Row site : sites.getRows())
            {
                String siteUrl = "";
                String geoLocation = "";
                for(Cell siteProp : site.getCells())
                {
                    if(siteProp.getKey().toLowerCase().equals("url")) siteUrl = siteProp.getValue();
                    else if(siteProp.getKey().toLowerCase().equals("geolocation")) geoLocation = siteProp.getValue();
                }
                if(siteUrl.length() > 0)
                {
                    getSiteProperties(siteUrl);
                }
            }
            currentRow += sites.getRowCount();
            end = sites.getTotalRow();
            System.out.println("row count : " + currentRow);
        }
        while(currentRow < end);

    }
    public void getAllWebsFromAdmin()
    {
        String url =appConfig.getTenantAdminSite()+"/_api/search/query";
        int currentRow=0, end=0;
        do
        {
            String response = new HttpUtils().Get(url, new AuthClient().GetAdminToken(), prepAdminWebBody(currentRow)).body();
            SiteUrlFromAdmin sites = JsonUtils.toObject(response, SiteUrlFromAdmin.class);
            for(Row site : sites.getRows())
            {
                String siteUrl = "";
                String geoLocation = "";
                for(Cell siteProp : site.getCells())
                {
                    if(siteProp.getKey().toLowerCase().equals("url")) siteUrl = siteProp.getValue();
                    else if(siteProp.getKey().toLowerCase().equals("geolocation")) geoLocation = siteProp.getValue();
                }
                if(siteUrl.length() > 0)
                {
                    getSiteProperties(siteUrl);
                }
            }
            currentRow += sites.getRowCount();
            end = sites.getTotalRow();
            System.out.println("row count : " + currentRow);
        }
        while(currentRow < end);
    }
    private Map<String, String> prepAdminSiteBody(int startInd)
    {
        /*
        https://42jghx-admin.sharepoint.com/_api/search/query
        ?querytext='(contentclass:STS_Site)'
        &trimduplicates=false
        &selectproperties='Title,Url,Path,ParentLink'
        &RowLimit=500
        &startrow=12400
         */
        Map<String, String> body = new HashMap<String, String>();
        body.put("querytext", "'(contentclass:STS_Site)'");
        body.put("trimduplicates","false");
        body.put("selectproperties", "'Title,Url,GeoLocationSource'");
        body.put("RowLimit","10");
        body.put("startrow",String.valueOf(startInd));
        return body;

    }
    private Map<String, String> prepAdminWebBody(int startInd)
    {
        /*
        https://42jghx-admin.sharepoint.com/_api/search/querydd
        ?querytext='(contentclass:STS_Web)'
        &trimduplicates=false
        &selectproperties='Title,Url,Path,ParentLink'
        &RowLimit=500
        &startrow=12400
         */
        Map<String, String> body = new HashMap<String, String>();
        body.put("querytext", "'(contentclass:STS_Web)'");
        body.put("trimduplicates","false");
        body.put("selectproperties", "'Title,Url,Path,ParentLink'");
        body.put("RowLimit","10");
        body.put("startrow",String.valueOf(startInd));
        return body;

    }
    private Map<String, String> getSiteQuery()
    {
        /*
        select=AllowExternalEmbeddingWrapper,AllowedExternalDomains,CanSyncHubSitePermissions,CanUpgrade,CommentsOnSitePagesDisabled,ComplianceAttribute,CustomizedFormsPages,ExternalUserExpirationInDays,RelatedGroupId,SearchBoxInNavBar,SearchBoxPlaceholderText,SensitivityLabelId,ShowPeoplePickerSuggestionsForGuestUsers,SitePolicyEnabled,SocialBarOnSitePagesDisabled,StatusBarLink,StatusBarText,ThicketSupportDisabled,RelatedGroupId
        &
        expand=Owner,CustomScriptSafeDomains,SensitivityLabelInfo,ServerRelativePath,Usage,UpgradeInfo,Audit,SecondaryContact

         */
        Map<String, String> query = new HashMap<>();
        query.put("expand","Owner,CustomScriptSafeDomains,SensitivityLabelInfo,ServerRelativePath,Usage,UpgradeInfo,Audit,SecondaryContact");
        query.put("select","AllowExternalEmbeddingWrapper,AllowedExternalDomains,CanSyncHubSitePermissions,CanUpgrade,CommentsOnSitePagesDisabled,ComplianceAttribute,CustomizedFormsPages,ExternalUserExpirationInDays,RelatedGroupId,SearchBoxInNavBar,SearchBoxPlaceholderText,SensitivityLabelId,ShowPeoplePickerSuggestionsForGuestUsers,SitePolicyEnabled,SocialBarOnSitePagesDisabled,StatusBarLink,StatusBarText,ThicketSupportDisabled,RelatedGroupId");
        return query;
    }

    public void getSiteProperties(String url)
    {
        String endpoint = url+"/_api/site";
        String siteResponse = new HttpUtils()
            .Get(endpoint, new AuthClient().GetSiteClientToken(),getSiteQuery())
            .body();
        Site site = new Site(JsonUtils.toObject(siteResponse, SiteProperties.class));
        site.updateSiteProp(getSitePropertiesV2(appConfig.getTenantAdminSite(),url));


        //Site Owner Details
//        response = new HttpUtils()
//            .Get(endpoint+"/Owner", new AuthClient().GetSiteClientToken(),null)
//            .body();
//        site.updateOwner(JsonUtils.toObject(response, SiteOwners.class));
//
//        //Site Usage
//        response = new HttpUtils()
//            .Get(endpoint+"/usage", new AuthClient().GetSiteClientToken(),null)
//            .body();
//        site.updateUsage(JsonUtils.toObject(response, SiteUsage.class));
//
//        //Site Secondary Contact
//        response = new HttpUtils()
//        .Get(endpoint+"/secondarycontact", new AuthClient().GetSiteClientToken(),null)
//        .body();
//        site.updateSecondaryContact(JsonUtils.toObject(response, SiteSecondaryContact.class));
//
//
//        //Site Audit
//        response = new HttpUtils()
//            .Get(endpoint+"/audit", new AuthClient().GetSiteClientToken(),null)
//            .body();
//        site.updateAudit(JsonUtils.toObject(response, SiteAudit.class));

        System.out.println(site);
        //Site Audit
    }

    public TenantLevelSiteProperties getSitePropertiesV2(String adminSite, String url)
    {
        String endpoint = adminSite+"/_vti_bin/client.svc/ProcessQuery";
        String response = new HttpUtils()
                .PostAsXML(endpoint,
                        new AuthClient().GetAdminToken(),
                        String.format(getTenantSitePropXml(),url,appConfig.getTenatId()))
                .body();
        System.out.println(response);
        String breakResponse = response.split("},1,")[1];
        TenantLevelSiteProperties siteProp = (JsonUtils.toObject(breakResponse.substring(0,breakResponse.length()-2), TenantLevelSiteProperties.class));
        return siteProp;

        //Site Audit
    }
    private String getTenantSitePropXml()
    {
        return "<Request AddExpandoFieldTypeSuffix=\"true\" SchemaVersion=\"15.0.0.0\" LibraryVersion=\"16.0.0.0\" ApplicationName=\".NET Library\" xmlns=\"http://schemas.microsoft.com/sharepoint/clientquery/2009\"><Actions><Query Id=\"1\" ObjectPathId=\"12\"><Query SelectAllProperties=\"true\"><Properties/></Query></Query></Actions><ObjectPaths><Method Id=\"12\" ParentId=\"1\" Name=\"GetSitePropertiesByUrl\"><Parameters><Parameter Type=\"String\">%s</Parameter><Parameter Type=\"Boolean\"></Parameter></Parameters></Method><Identity Id=\"1\" Name=\"9f0341a1-90f2-3000-9074-7131eb48af00|908bed80-a04a-4433-b4a0-883d9847d110:%s&#xA;Tenant\"/></ObjectPaths></Request>";
    }
    public void getWebProperties(String url)
    {

    }
    public void getSiteUsers()
    {

    }
    public void getSiteGroups()
    {

    }

    public void getSiteStat()
    {

    }
    public void getWebStats()
    {

    }

}
