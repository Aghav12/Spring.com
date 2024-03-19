package com.BikkadIT.ClientFlightApi.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.BikkadIT.ClientFlightApi.responce.Flight;



public class ServiceI implements Service {

	@Override
	public void getDataRestTemplateJson() {
		String url = "http://localhost:9090/getAllFlight";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> forEntity = rt.getForEntity(url, String.class);
		String json = forEntity.getBody();
		System.out.println(json);
		
	}

	@Override
	public void getDataWebClientSyncJson() {
		String url = "http://localhost:9090/getAllFlight";

		WebClient webClient = WebClient.create();
		String json = webClient.get().uri(url).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(String.class)
				.block();
		System.out.println(json);

		System.out.println("Welcome to BikkadIT");
		
	}

	@Override
	public void getDataWebClientAsyncJson() {
		String url = "http://localhost:9090/getAllFlight";
		WebClient webClient = WebClient.create();

		webClient.get().uri(url).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(String.class)
				.subscribe(System.out::println);

		System.out.println("Welcome to BikkadIT");
		
	}

	@Override
	public void getDataRestTemplateObject() {
		String url = "http://localhost:9090/getAllFlight";
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<List<Flight>> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Flight>>() {
				}); // Use ParameterizedTypeReference to handle generic types

		// Retrieve the list of flights from the response entity
		List<Flight> flights = responseEntity.getBody();

		// Process the list of flights
		for (Flight flight : flights) {
			System.out.println(flight);
			}
		
	}

	@Override
	public void getDataWebClientSyncObject() {
		String url = "http://localhost:9090/getAllFlight";

		WebClient webClient = WebClient.create();
		List<Flight> flights = webClient.get().uri(url).accept(MediaType.APPLICATION_JSON).retrieve()
				.bodyToFlux(Flight.class).collectList().block();
		System.out.println(flights);

		for (Flight f : flights) {
			System.out.println(f);
		}

		System.out.println("Welcome to BikkadIT");

		
	}

	@Override
	public void getDataWebClientAsyncObject() {
		String url = "http://localhost:9090/getAllFlight";
		WebClient webClient = WebClient.create();

		webClient.get().uri(url).accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(Flight.class)
				.subscribe(System.out::println);

		System.out.println("Welcome to BikkadIT");
	}
		
	}

	

