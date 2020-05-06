package com.wcs.app.jf.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaClient
@EnableEurekaServer
@SpringBootApplication
public class LoanDisbursementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanDisbursementServiceApplication.class, args);
	}
}
