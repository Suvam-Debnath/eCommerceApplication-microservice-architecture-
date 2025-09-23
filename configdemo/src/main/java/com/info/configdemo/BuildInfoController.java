package com.info.configdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildInfoController {

    @Value("${OS:default}")
    private String buildId;

    @Value("${USERPROFILE:default}")
    private String buildVersion;

    @Value("${JAVA_HOME:default}")
    private String buildName;

    @GetMapping("/build-info")
    public String getBuildInfo(){
        return "Build ID: "+ buildId + ", Version: " + buildVersion + ", Name:" + buildName;
    }
}
