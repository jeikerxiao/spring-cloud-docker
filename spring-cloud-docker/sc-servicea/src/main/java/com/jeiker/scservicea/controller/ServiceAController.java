package com.jeiker.scservicea.controller;

import com.jeiker.scservicea.client.ServiceBClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author : xiao
 * @date : 17/12/27 下午1:58
 * @description :
 */
@RefreshScope
@RestController
public class ServiceAController {

    @Value("$(name:unknow)")
    private String name;

    @Autowired
    EurekaDiscoveryClient discoveryClient;
    @Autowired
    private ServiceBClient serviceBClient;

    @GetMapping("/")
    public String printServiceA() {
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        String result = serviceInstance.getServiceId()
                + "("
                + serviceInstance.getHost()
                + ":"
                + serviceInstance.getPort()
                + ")"
                + "===>name:"
                + name
                + "<br/>"
                + serviceBClient.printServiceB();
        return result;
    }

    @GetMapping("/current")
    public Principal getCurrentAccount(Principal principal) {
        return principal;
    }
}
