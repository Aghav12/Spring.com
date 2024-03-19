package com.BikkadIT.WebClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.WebClient.service.ServiceI;

@SpringBootApplication
public class WebClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(WebClientApplication.class, args);
		ServiceI bean = context.getBean(ServiceI.class);
		
	//	bean.getDataAsync();
		
		bean.getDataSync();
	}

}
