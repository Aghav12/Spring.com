package com.BikkadIT.ClientFlightApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.ClientFlightApi.service.ServiceI;

@SpringBootApplication
public class ClientFlightApiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ClientFlightApiApplication.class, args);
		ServiceI serviceImpl = context.getBean(ServiceI.class);
		//serviceImpl.getDataRestTemplateJson();
	//	serviceImpl.getDataWebClientSyncJson();
	//	serviceImpl.getDataWebClientASyncJson();
		serviceImpl.getDataRestTemplateObject();
	//	serviceImpl.getDataWebClientSyncObject();
	//	serviceImpl.getDataWebClientASyncObject();
	}

}
