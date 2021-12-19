package com.ms.practica2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient(name="api-man-socios-mongodb")
@EnableFeignClients
@SpringBootApplication
public class ApiManSociosMongodbRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiManSociosMongodbRibbonApplication.class, args);
	}

}
