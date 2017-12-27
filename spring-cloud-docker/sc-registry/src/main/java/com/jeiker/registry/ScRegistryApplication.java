package com.jeiker.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ScRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScRegistryApplication.class, args);
	}
}
