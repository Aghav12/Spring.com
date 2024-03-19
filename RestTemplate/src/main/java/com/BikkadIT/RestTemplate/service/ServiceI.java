package com.BikkadIT.RestTemplate.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
public class ServiceI implements Service {

	@Override
	public void getDataUsingResttemplate() {
		//String url = "http://localhost:9090/getAll";
		String url = "https://api.coindesk.com/v1/bpi/currentprice.json";
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> forEntity = rt.getForEntity(url, String.class);
		
		String json = forEntity.getBody();
		System.out.println(json);
		
	}

}
