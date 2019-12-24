package com.mrxmgl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients//启用feign客户端
@SpringBootApplication
@EnableEurekaClient
public class SpringbootFyglApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFyglApplication.class, args);
		System.out.println("费用管理：-------------------------http://localhost:8083/fygl/bgtz/browse");
	}

}