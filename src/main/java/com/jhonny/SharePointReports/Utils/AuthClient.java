package com.jhonny.SharePointReports.Utils;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AuthClient
{
    final private String clientAssertionType = "urn:ietf:params:oauth:client-assertion-type:jwt-bearer";
    final private String authUrl = "https://login.microsoftonline.com/%s/oauth2/v2.0/token";
    final private String bodyPattern = "\"grant_type=client_credentials&client_id=%s&client_assertion=%s&client_assertion_type=%s&scope=%s";
    private String tenant_id, client_id, client_assertion, scope;
    private AppConfig appConfig;

    public AuthClient(/*String tenantId, String client_id, String client_assertion,*/ String scope)
    {
//        this.tenant_id = tenantId;
//        this.client_id = client_id;
        this.appConfig = new AnnotationConfigApplicationContext(AppConfig.class).getBean(AppConfig.class);
        this.client_assertion = new JwtGenerater().getJwtToken();
        this.scope = scope+"/.default";
    }   

    private String prepareUrl()
    {
        String url = String.format(this.authUrl, appConfig.getTenatId());
        return url;
    }
    public Map<String, String> prepareBodyAsForm()
    {
        Map<String, String> formData = new HashMap<>();
        formData.put("grant_type","client_credentials");
        formData.put("client_id", client_id);
        formData.put("client_assertion",client_assertion);
        formData.put("client_assertion_type",clientAssertionType);
        formData.put("scope",scope);
        return formData;
    }
    public String prepareBodyAsURLEncoder()
    {
        String body = String.format(bodyPattern,client_id, client_assertion, clientAssertionType,scope);
        return body;
    }
    public String prepareBodyAsJson()
    {
        String body = String.format("{\n"+
                "\"grant_type\":\"client_credentials\", "+
                "\"client_id\":\"%s\", "+
                "\"client_assertion\":\"%s\", "+
                "\"client_assertion_type\":\"%s\", "+
                "\"scope\":\"%s\"\n}",
                appConfig.getClientId(), 
                this.client_assertion, 
                this.clientAssertionType, 
                this.scope);
        return body;
    }
    public String getAccessToken()
    {
        String tokenResponse = new HttpUtils().Post(prepareUrl(), prepareBodyAsForm()).body();
        //to parse the response object and get the token form it.
        return tokenResponse.toString();
    }
}
