package com.jhonny.SharePointReports.Utils;


import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AuthClient
{
    final private String clientAssertionType = "urn:ietf:params:oauth:client-assertion-type:jwt-bearer";
    final private String authUrl = "https://login.microsoftonline.com/%s/oauth2/v2.0/token";
    final private String adminSiteScopeTemplate = "https://%s-admin.sharepoint.com/.default";
    final private String siteScopeTemplate = "https://%s.sharepoint.com/.default";
    //final private String bodyPattern = "\"grant_type=client_credentials&client_id=%s&client_assertion=%s&client_assertion_type=%s&scope=%s";
    private String client_assertion;
    private AppConfig appConfig;

    public AuthClient()
    {
//        this.tenant_id = tenantId;
//        this.client_id = client_id;
        this.appConfig = new AnnotationConfigApplicationContext(AppConfig.class).getBean(AppConfig.class);
        this.client_assertion = new JwtGenerater().getJwtToken();
        //this.scope = scope+"/.default";
    }   

    private String prepareUrl()
    {
        String url = String.format(this.authUrl, appConfig.getTenatId());
        return url;
    }
    public Map<String, String> prepareBodyAsForm(String requiredScope)
    {
        Map<String, String> formData = new HashMap<>();
        formData.put("grant_type","client_credentials");
        formData.put("client_id", appConfig.getClientId());
        formData.put("client_assertion",client_assertion);
        formData.put("client_assertion_type",clientAssertionType);
        formData.put("scope",requiredScope);
        return formData;
    }
    // public String prepareBodyAsURLEncoder()
    // {
    //     String body = String.format(bodyPattern,AppConfig.getClientId(), client_assertion, clientAssertionType,scope);
    //     return body;
    // }
    // public String prepareBodyAsJson()
    // {
    //     String body = String.format("{\n"+
    //             "\"grant_type\":\"client_credentials\", "+
    //             "\"client_id\":\"%s\", "+
    //             "\"client_assertion\":\"%s\", "+
    //             "\"client_assertion_type\":\"%s\", "+
    //             "\"scope\":\"%s\"\n}",
    //             appConfig.getClientId(), 
    //             this.client_assertion, 
    //             this.clientAssertionType, 
    //             this.scope);
    //     return body;
    // }

    // public String getAccessToken()
    // {
    //     String tokenResponse = new HttpUtils().Post(prepareUrl(), prepareBodyAsForm(this.scope)).body();
    //     //to parse the response object and get the token form it.
    //     // return tokenResponse.toString();
    //     TokenResponse response = JsonUtils.toObject(tokenResponse, TokenResponse.class);
    //     return response.getAccess_token();
    // }

    public String GetAdminToken()
    {
        String tokenResponse = new HttpUtils()
                        .Post(prepareUrl(), prepareBodyAsForm(String.format(adminSiteScopeTemplate, appConfig.getTenantName())))
                        .body();
        TokenResponse response = JsonUtils.toObject(tokenResponse, TokenResponse.class);
        return response.getAccess_token();
    }
    public String GetClientToken(/*String scope*/)
    {
        String tokenResponse = new HttpUtils()
                        .Post(prepareUrl(), prepareBodyAsForm(String.format(siteScopeTemplate, appConfig.getTenantName())))
                        .body();
        TokenResponse response = JsonUtils.toObject(tokenResponse, TokenResponse.class);
        return response.getAccess_token();
    }
}

class TokenResponse
{
    private String token_type;
    private int expires_in;
    private int ext_expires_in;
    private String access_token;
    public String getToken_type() {
        return token_type;
    }
    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }
    public int getExpires_in() {
        return expires_in;
    }
    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }
    public int getExt_expires_in() {
        return ext_expires_in;
    }
    public void setExt_expires_in(int ext_expires_in) {
        this.ext_expires_in = ext_expires_in;
    }
    public String getAccess_token() {
        return access_token;
    }
    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
    
}
