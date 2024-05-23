package com.proyectoFinal.cuencaNan.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.proyectoFinal.cuencaNan.model.Response;

@RestController
public class Geocoder {
	
	private static final Object API_KEY = "AIzaSyDrXMvnZizl4M8hj63WAzTGSfjIx44cnII";

	@GetMapping("/test")
	public String test () {
		return "service up";
	}
	
	@GetMapping("/getLocation")
	public Response getGeoDetails(@RequestParam String address) {
		UriComponents uri = UriComponentsBuilder.newInstance()
		.scheme("https")
		.host("maps.googleapis.com")
		.path("maps/api/geocode/json")
		.queryParam("key", API_KEY)
		.queryParam("address", address)
		.build();
		System.out.println(uri.toUriString());
		ResponseEntity<Response> response =  new RestTemplate().getForEntity(uri.toUriString(),Response.class);
		return response.getBody();
	}
}
