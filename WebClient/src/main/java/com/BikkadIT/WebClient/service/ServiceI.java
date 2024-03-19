
package com.BikkadIT.WebClient.service;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;



@org.springframework.stereotype.Service
public class ServiceI implements Service {

	@Override
	public void getDataSync() {
		//String url = "http://localhost:9090/getAll";
		  String url = "https://api.coindesk.com/v1/bpi/currentprice.json";
		  
		  WebClient wc = WebClient.create();
		  String json = wc.get()
				  .uri(url)
				  .accept(MediaType.APPLICATION_JSON)
				  .retrieve()
				  .bodyToMono(String.class)
				  .block();
		  
		  System.out.println(json);
				
		
	}

	@Override
	public void getDataAsync() {
		//String url = "http://localhost:9090/getAll";
		  String url = "https://api.coindesk.com/v1/bpi/currentprice.json";
		  
		  WebClient wc = WebClient.create();
		  wc.get()
		  .uri(url)
		  .accept(MediaType.APPLICATION_JSON)
		  .retrieve()
		  .bodyToMono(String.class)
		  .subscribe(System.out::println);
		
	}

}
