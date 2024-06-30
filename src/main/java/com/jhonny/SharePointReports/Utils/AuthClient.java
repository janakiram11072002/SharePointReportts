package com.jhonny.SharePointReports.Utils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AuthClient
{
    final private String clientAssertionType = "urn:ietf:params:oauth:client-assertion-type:jwt-bearer";
    final private String authUrl = "https://login.microsoftonline.com/%s/oauth2/v2.0/token";
    private String tenant_id, client_id, client_assertion, scope;
    private AppConfig appConfig;

    public AuthClient(/*String tenantId, String client_id, String client_assertion,*/ String scope)
    {
//        this.tenant_id = tenantId;
//        this.client_id = client_id;
        this.appConfig = new AnnotationConfigApplicationContext(AppConfig.class).getBean(AppConfig.class);
        this.client_assertion = new JwtGenerater().getJwtToken();
        this.scope = scope;
    }   

    private String prepareUrl()
    {
        String url = String.format(this.authUrl, appConfig.getTenatId());
        return url;
    }

    public String prepareBody()
    {
        String body = String.format("{\"client_id\":\"%s\", "+
                        "\"grant_type\":\"client_credentials\", "+
                        "\"client_assertion\":\"%s\", "+
                        "\"client_assertion_type\":\"%s\", "+
                        "\"scope\":\"%s\"}",
                        appConfig.getClientId(), this.client_assertion, this.clientAssertionType, this.scope
                         );
        return body;
    }
    public String getAccessToken()
    {
        String tokenResponse = new HttpUtils().Post(prepareUrl(), prepareBody()).body();
        //to parse the response object and get the token form it.
        return tokenResponse.toString();
    }
}
