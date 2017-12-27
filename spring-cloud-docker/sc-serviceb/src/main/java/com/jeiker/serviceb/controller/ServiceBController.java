package com.jeiker.serviceb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : xiao
 * @date : 17/12/27 下午1:43
 * @description :
 */
@RefreshScope
@RestController
public class ServiceBController {

    @Autowired
    EurekaDiscoveryClient discoveryClient;

    @Value("${msg:unknown}")
    private String msg;

    @GetMapping("/")
    public String printServiceB() {
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        String result = serviceInstance.getServiceId()
                + "("
                + serviceInstance.getHost()
                + ":"
                + serviceInstance.getPort()
                + ")"
                + "===>Say"
                + msg;
        return result;
    }
}
