package com.BikkadIT.RestTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.RestTemplate.service.ServiceI;

@SpringBootApplication
public class RestTemplateApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RestTemplateApplication.class, args);
		ServiceI bean = context.getBean(ServiceI.class);
		bean.getDataUsingResttemplate();
	}

}
