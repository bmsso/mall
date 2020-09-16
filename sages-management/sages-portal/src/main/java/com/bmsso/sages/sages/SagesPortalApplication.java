package com.bmsso.sages.sages;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class SagesPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SagesPortalApplication.class, args);
	}

}
