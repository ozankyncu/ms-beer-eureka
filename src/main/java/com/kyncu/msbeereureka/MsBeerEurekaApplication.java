package com.kyncu.msbeereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsBeerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsBeerEurekaApplication.class, args);
	}

}
