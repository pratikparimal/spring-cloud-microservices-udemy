package com.spring.cloud.microservices.limitservice;

import com.spring.cloud.microservices.limitservice.bean.Configuration;
import com.spring.cloud.microservices.limitservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limit")
    public LimitConfiguration retrieveLimitFromConfiguration() {
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
