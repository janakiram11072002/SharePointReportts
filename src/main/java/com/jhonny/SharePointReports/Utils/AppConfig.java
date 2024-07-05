package com.jhonny.SharePointReports.Utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Configuration()
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
@PropertySource("classpath:application.properties")
public class AppConfig
{
    final private String adminSiteTemplate = "https://%s-admin.sharepoint.com";
    @Value("${app.config.tenantid}")
    private String tenantid;
    @Value("${app.config.tenantname}")
    private String tenantname;
    @Value("${app.config.certificatepath}")
    private String certificatepath;
    @Value("${app.config.certificatekey}")
    private String certificatekey;
    @Value("${app.config.clientid}")
    private String clientid;

    public String getTenatId() {
        return tenantid;
    }

    public String getTenantName() {
        return tenantname;
    }

    public String getCertPath() {
        return certificatepath;
    }

    public String getCertKey() {
        return certificatekey;
    }

    public String getClientId(){
        return clientid;
    public String getTenantAdminSite()
    {
        return String.format(adminSiteTemplate, tenantname);
    }

    /*@Bean(value = "AppConfig")
    public AppConfig AppConfig()
    {
        return this;
    }*/
}
