package com.jhonny.SharePointReports.TestControllers;

import com.jhonny.SharePointReports.Modules.Operations.DataCollector;
import com.jhonny.SharePointReports.Utils.AuthClient;
import com.jhonny.SharePointReports.Utils.HttpUtils;
import com.jhonny.SharePointReports.Utils.JwtGenerater;

// import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController
{
    @GetMapping("/")
    public String sayHello()
    {
        return "Hello";
    }
    @GetMapping("/get")
    public String testGet(String url)
    {
        if(url == null) url = "https://api.restful-api.dev/objects";

        return new HttpUtils().Get(url,null,null).body();
    }

    @PostMapping("/post")
    public String testPost(String url)
    {
        if(url == null) url = "https://api.restful-api.dev/objects";
        String headers = "{ \"id\":\"7\", \"name\":\"AppleMacBookPro16\", \"data\":{ \"year\":2019, \"price\":1849.99, \"CPUmodel\":\"IntelCorei9\", \"Harddisksize\":\"1TB\" }, \"createdAt\":\"2022-11-21T20:06:23.986Z\" }";
        //return new HttpUtils().Post(url,headers).body();
        return "hello";
    }

    @GetMapping("/jwt")
    public String jwt()
    {
        return new JwtGenerater().getJwtToken();
    }

    @GetMapping("/token")
    public String token()
    {
        AuthClient token = new AuthClient();
        return token.GetAdminToken();
    }
    @GetMapping("/ctoken")
    public String getClientToken()
    {
        AuthClient token = new AuthClient();
        return token.GetSiteClientToken();
    }
    @GetMapping("/allsites")
    public String allStie()
    {
        String url = "https://42jghx-admin.sharepoint.com/_api/search/query";
        Map<String, String> body = new HashMap<>();
//        body.put("querytext","\'contentclass:STS_Site Path:\"https://42jghx.sharepoint.com/*\"\'");
//        body.put("rowlimit","500");
        body.put("querytext", "'(contentclass:STS_Site)'");
        body.put("trimduplicates","false");
        body.put("selectproperties", "'Title,Url,Path,ParentLink,GeoLocation'");
        body.put("RowLimit","1");
        body.put("startrow",String.valueOf("0"));
        return new HttpUtils().Get(url, new AuthClient().GetAdminToken(), body).body();
    }

    @GetMapping("/allwebs")
    public String allWebs()
    {
        String url = "https://42jghx-admin.sharepoint.com/_api/search/query";
        Map<String, String> body = new HashMap<>();
//        body.put("querytext","\'contentclass:STS_Site Path:\"https://42jghx.sharepoint.com/*\"\'");
//        body.put("rowlimit","500");
        body.put("querytext", "'(contentclass:STS_Web)'");
        body.put("trimduplicates","false");
        body.put("selectproperties", "'Title,Url,Path,ParentLink'");
        body.put("RowLimit","500");
        body.put("startrow",String.valueOf("0"));
        return new HttpUtils().Get(url, new AuthClient().GetAdminToken(), body).body();
    }

    @GetMapping("/site")
    public String getSite(@RequestParam  String url)
    {
        // String url = "https://42jghx.sharepoint.com/_api/search/query";
        url = "https://42jghx.sharepoint.com/sites/1gate";
        Map<String, String> body = new HashMap<>();
//        body.put("querytext","\'contentclass:STS_Site Path:\"https://42jghx.sharepoint.com/*\"\'");
//        body.put("rowlimit","500");
//        body.put("querytext", "'(contentclass:STS_Web)'");
//        body.put("trimduplicates","false");
        body.put("selectproperties", "'Owner,Url,Path,Usage'");
//        body.put("RowLimit","500");
//        body.put("startrow",String.valueOf("0"));
        url+="/_api/site";
        return new HttpUtils().Get(url, new AuthClient().GetSiteClientToken(), body).body();
    }

    @GetMapping("/web")
    public String getWeb(@RequestParam  String endpoint)
    {
        // String url = "https://42jghx.sharepoint.com/_api/search/query";
        String url = "https://42jghx.sharepoint.com/sites/1gate";
        Map<String, String> body = new HashMap<>();
//        body.put("querytext","\'contentclass:STS_Site Path:\"https://42jghx.sharepoint.com/*\"\'");
//        body.put("rowlimit","500");
//        body.put("querytext", "'(contentclass:STS_Web)'");
//        body.put("trimduplicates","false");
//        body.put("selectproperties", "'Owner,Url,Path,Usage'");
//        body.put("RowLimit","500");
//        body.put("startrow",String.valueOf("0"));
        url+="/_api/web"+endpoint;
        return new HttpUtils().Get(url, new AuthClient().GetSiteClientToken(), body).body();
    }

    @GetMapping("/test")
    public String testDataColecor()
    {
        new DataCollector().initilize();
        //new DataCollector().getAllWebsFromAdmin();
        return "success";
    }

    @GetMapping("/sitev2")
    public String siteV2data()
    {
        new DataCollector().getSitePropertiesV2("https://42jghx-admin.sharepoint.com","https://42jghx.sharepoint.com/sites/1gate");
        //new DataCollector().getAllWebsFromAdmin();
        return "success";
    }
    @GetMapping("/webv2")
    public String webV2data()
    {
        new DataCollector().getWebProperties("abcd","abcd","abcd","https://42jghx.sharepoint.com/sites/1gate");
        //new DataCollector().getAllWebsFromAdmin();
        return "success";
    }
    @GetMapping("/websync")
    public String webSync()
    {
        int webs = new DataCollector().getAllWebsFromAdmin("https://42jghx-admin.sharepoint.com");
        //new DataCollector().getAllWebsFromAdmin();
        return "websCount = "+String.valueOf(webs);
    }
}
