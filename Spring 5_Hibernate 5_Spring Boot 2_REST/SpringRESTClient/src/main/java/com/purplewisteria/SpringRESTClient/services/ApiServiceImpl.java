package com.purplewisteria.SpringRESTClient.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.purplewisteria.SpringRESTClient.domain.Album;
import com.purplewisteria.SpringRESTClient.domain.Quote;

@Service
public class ApiServiceImpl implements ApiService {

	private RestTemplate restTemplate;
	
	public ApiServiceImpl(RestTemplate restTemplate) {
	
		this.restTemplate = restTemplate;
	}
	
	@Override
	public Quote getQuote() {
	
       Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
	 return quote;
	}

	@Override
	public Album [] getAlbums() {
		
	Album [] albums = restTemplate.getForObject("https://jsonplaceholder.typicode.com/albums", Album[].class);
		
		return albums;
	}
	
	

}
