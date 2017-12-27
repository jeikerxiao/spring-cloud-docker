package com.jeiker.scservicea.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : xiao
 * @date : 17/12/27 下午1:52
 * @description :
 */
@FeignClient(name = "sc-serviceb", fallback = ServiceBClient.ServiceBClientFallback.class)
public interface ServiceBClient {

    @GetMapping("/")
    String printServiceB();

    @Component
    class ServiceBClientFallback implements ServiceBClient {

        private static final Logger logger = LoggerFactory.getLogger(ServiceBClientFallback.class);

        @Override
        public String printServiceB() {
            logger.info("异常发生，进入fallback方法");
            return "SERVICE B FAILED! - FALLING BACK";
        }

    }

}
