package com.jhonny.SharePointReports.Modules.Operations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jhonny.SharePointReports.Utils.AppConfig;

public class DataCollector
{
    private AppConfig appConfig;
    
    public void DataCollector()
    {
        appConfig = new AnnotationConfigApplicationContext(AppConfig.class).getBean(AppConfig.class);

    }

    public void initilize()
    {

    }
    /**
     * to get all sites under admin site in single command
     * "https://42jghx-admin.sharepoint.com/_api/search/query
     *      ?querytext='(contentclass:STS_Site) (contentclass:STS_Web)'
     *      &trimduplicates=false&selectproperties='Title,Url,Path,ParentLink'
     *      &RowLimit=500&startrow=12400 "
     */
    final String api = "" ;
    public String prepareAdminQuery()
    {
        return null;
    }
    public void getAllSitesFromAdmin()
    {

    }
    public void getSiteProperties(String url)
    {

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
