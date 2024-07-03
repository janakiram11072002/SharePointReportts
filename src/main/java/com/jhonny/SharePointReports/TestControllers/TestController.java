package com.jhonny.SharePointReports.TestControllers;

import com.jhonny.SharePointReports.Utils.AuthClient;
import com.jhonny.SharePointReports.Utils.HttpUtils;
import com.jhonny.SharePointReports.Utils.JwtGenerater;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/test")
public class TestController
{
    @GetMapping("/get")
    public String testGet(String url)
    {
        if(url == null) url = "https://api.restful-api.dev/objects";

        return new HttpUtils().Get(url).body();
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
        return new AuthClient("https://42jghx-admin.sharepoint.com").getAccessToken();
    }
}
