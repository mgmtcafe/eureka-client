package com.clientmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
//@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
//@EnableHystrixDashboard
public class HelloClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelloClientApplication.class, args);
	}
}
