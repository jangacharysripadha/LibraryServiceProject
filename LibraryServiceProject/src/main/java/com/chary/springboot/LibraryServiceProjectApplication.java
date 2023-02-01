package com.chary.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class LibraryServiceProjectApplication {
	
	@Bean
	@Primary
	public RestTemplate getreRestTemplate()
	{
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(LibraryServiceProjectApplication.class, args);
		System.out.println("welcome to library service project");
	}

}
