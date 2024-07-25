package com.tech.cloud.loadbalancer.userapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@LoadBalancerClient(name = "userapp")
public class SpringCloudBalancerUserappApplication {


	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudBalancerUserappApplication.class, args);
	}


}
