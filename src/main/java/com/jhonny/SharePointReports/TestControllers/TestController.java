package com.jhonny.SharePointReports.TestControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController
{
    @GetMapping("/get")
    public String testGet(String url)
    {
        return null;
    }

    @GetMapping("/get")
    public String testPost(String url)
    {
        return null;
    }
}
