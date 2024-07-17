package com.jhonny.SharePointReports.Modules.Operations;

import com.jhonny.SharePointReports.PersistenceModels.Cell;
import com.jhonny.SharePointReports.PersistenceModels.Row;
import com.jhonny.SharePointReports.PersistenceModels.SiteUrlFromAdmin;
import com.jhonny.SharePointReports.Utils.AuthClient;
import com.jhonny.SharePointReports.Utils.HttpUtils;
import com.jhonny.SharePointReports.Utils.JsonUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
        System.out.println(url);
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
