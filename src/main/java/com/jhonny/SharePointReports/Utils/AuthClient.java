package com.jhonny.SharePointReports.Utils;

import org.springframework.core.env.Environment;

public class AuthClient 
{
    final private String clientAssertionType = "urn:ietf:params:oauth:client-assertion-type:jwt-bearer";
    final private String authUrl = "https://login.microsoftonline.com/{0}/oauth2/v2.0/token";
    private String tenant_id, client_id, client_assertion, scope;

    public AuthClient(String tenantId, String client_id, String client_assertion, String scope)
    {
        this.tenant_id = tenantId;
        this.client_id = client_id;
        this.client_assertion = client_assertion;
        this.scope = scope;
    }   

    private String prepareUrl()
    {
        return String.format(authUrl, tenant_id);
    }

    public String prepareBody()
    {
        String body = String.format("{\"client_id\":\"{0}\","+
                        "\"client_assertion\":\"{1}\","+
                        "\"grant_type\":\"client_credentials\","+
                        "\"client_assertion_type\":\"{2}\","+
                        "\"scope\":\"{3}\"}",
                        client_id, client_assertion, clientAssertionType, scope
                         );
        return body;
    }
    public String getAccessToken()
    {
        String tokenResponse = new HttpUtils().Post(prepareUrl(), prepareBody()).body();
        //to parse the response object and get the token form it.
        return "abcd";
    }
}
