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
            String response = new HttpUtils().Get(url, new AuthClient().GetAdminToken(), prepSiteBody(currentRow)).body();
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
            String response = new HttpUtils().Get(url, new AuthClient().GetAdminToken(), prepWebBody(currentRow)).body();
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
    private Map<String, String> prepSiteBody(int startInd)
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
    private Map<String, String> prepWebBody(int startInd)
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
    public void getSiteProperties(String url)
    {
        String endpoint = url+"/_api/site";
        String response = new HttpUtils()
            .Get(endpoint, new AuthClient().GetSiteClientToken(),null)
            .body();
        Site site = new Site(JsonUtils.toObject(response, SiteProperties.class));

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

        System.out.println(response);
        //Site Audit
    }

    public String getSitePropertiesV2(String url)
    {
        String endpoint = url+"/_vti_bin/client.svc/ProcessQuery";
        String body = "<Request AddExpandoFieldTypeSuffix=\"true\" SchemaVersion=\"15.0.0.0\" LibraryVersion=\"16.0.0.0\" ApplicationName=\".NET Library\" xmlns=\"http://schemas.microsoft.com/sharepoint/clientquery/2009\"><Actions><ObjectPath Id=\"2\" ObjectPathId=\"1\" /><ObjectPath Id=\"4\" ObjectPathId=\"3\" /><Query Id=\"5\" ObjectPathId=\"3\"><Query SelectAllProperties=\"false\"><Properties><Property Name=\"AllowCreateDeclarativeWorkflow\" ScalarProperty=\"true\" /><Property Name=\"AllowDesigner\" ScalarProperty=\"true\" /><Property Name=\"AllowMasterPageEditing\" ScalarProperty=\"true\" /><Property Name=\"AllowRevertFromTemplate\" ScalarProperty=\"true\" /><Property Name=\"AllowSaveDeclarativeWorkflowAsTemplate\" ScalarProperty=\"true\" /><Property Name=\"AllowSavePublishDeclarativeWorkflow\" ScalarProperty=\"true\" /><Property Name=\"AllowSelfServiceUpgrade\" ScalarProperty=\"true\" /><Property Name=\"AllowSelfServiceUpgradeEvaluation\" ScalarProperty=\"true\" /><Property Name=\"Audit\"><Query SelectAllProperties=\"false\"><Properties><Property Name=\"AuditFlags\" ScalarProperty=\"true\" /></Properties></Query></Property><Property Name=\"AuditLogTrimmingRetention\" ScalarProperty=\"true\" /><Property Name=\"CanUpgrade\" ScalarProperty=\"true\" /><Property Name=\"Classification\" ScalarProperty=\"true\" /><Property Name=\"CompatibilityLevel\" ScalarProperty=\"true\" /><Property Name=\"DisableAppViews\" ScalarProperty=\"true\" /><Property Name=\"DisableCompanyWideSharingLinks\" ScalarProperty=\"true\" /><Property Name=\"DisableFlows\" ScalarProperty=\"true\" /><Property Name=\"ExternalSharingTipsEnabled\" ScalarProperty=\"true\" /><Property Name=\"ExternalUserExpirationInDays\" ScalarProperty=\"true\" /><Property Name=\"GroupId\" ScalarProperty=\"true\" /><Property Name=\"Id\" ScalarProperty=\"true\" /><Property Name=\"LockIssue\" ScalarProperty=\"true\" /><Property Name=\"MaxItemsPerThrottledOperation\" ScalarProperty=\"true\" /><Property Name=\"NeedsB2BUpgrade\" ScalarProperty=\"true\" /><Property Name=\"Owner\"><Query SelectAllProperties=\"false\"><Properties><Property Name=\"LoginName\" ScalarProperty=\"true\" /><Property Name=\"Email\" ScalarProperty=\"true\" /><Property Name=\"Title\" ScalarProperty=\"true\" /></Properties></Query></Property><Property Name=\"PrimaryUri\" ScalarProperty=\"true\" /><Property Name=\"ReadOnly\" ScalarProperty=\"true\" /><Property Name=\"RequiredDesignerVersion\" ScalarProperty=\"true\" /><Property Name=\"SandboxedCodeActivationCapability\" ScalarProperty=\"true\" /><Property Name=\"SecondaryContact\"><Query SelectAllProperties=\"false\"><Properties><Property Name=\"LoginName\" ScalarProperty=\"true\" /><Property Name=\"Email\" ScalarProperty=\"true\" /><Property Name=\"Title\" ScalarProperty=\"true\" /></Properties></Query></Property><Property Name=\"SensitivityLabel\" ScalarProperty=\"true\" /><Property Name=\"SensitivityLabelId\" ScalarProperty=\"true\" /><Property Name=\"SensitivityLabelInfo\" ScalarProperty=\"true\" /><Property Name=\"ServerRelativeUrl\" ScalarProperty=\"true\" /><Property Name=\"ShareByEmailEnabled\" ScalarProperty=\"true\" /><Property Name=\"ShareByLinkEnabled\" ScalarProperty=\"true\" /><Property Name=\"ShowPeoplePickerSuggestionsForGuestUsers\" ScalarProperty=\"true\" /><Property Name=\"ShowUrlStructure\" ScalarProperty=\"true\" /><Property Name=\"StatusBarLink\" ScalarProperty=\"true\" /><Property Name=\"StatusBarText\" ScalarProperty=\"true\" /><Property Name=\"TrimAuditLog\" ScalarProperty=\"true\" /><Property Name=\"UIVersionConfigurationEnabled\" ScalarProperty=\"true\" /><Property Name=\"UpgradeInfo\" ScalarProperty=\"true\" /><Property Name=\"UpgradeReminderDate\" ScalarProperty=\"true\" /><Property Name=\"UpgradeScheduled\" ScalarProperty=\"true\" /><Property Name=\"UpgradeScheduledDate\" ScalarProperty=\"true\" /><Property Name=\"Upgrading\" ScalarProperty=\"true\" /><Property Name=\"Url\" ScalarProperty=\"true\" /><Property Name=\"Usage\" ScalarProperty=\"true\" /></Properties></Query></Query></Actions><ObjectPaths><StaticProperty Id=\"1\" TypeId=\"{3747adcd-a3c3-41b9-bfab-4a64dd2f1e0a}\" Name=\"Current\" /><Property Id=\"3\" ParentId=\"1\" Name=\"Site\" /></ObjectPaths></Request>\n";
        String response = (url.contains("-my.sharepoint.com")) ?
                (new HttpUtils().PostAsXML(endpoint, new AuthClient().GetOneDriveClientToken(),body).body()) :
                (new HttpUtils().PostAsXML(endpoint, new AuthClient().GetSiteClientToken(),body).body());
        System.out.println(response);
        //Site site = new Site(JsonUtils.toObject(response, SiteProperties.class));
        return response;

        //Site Audit
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
