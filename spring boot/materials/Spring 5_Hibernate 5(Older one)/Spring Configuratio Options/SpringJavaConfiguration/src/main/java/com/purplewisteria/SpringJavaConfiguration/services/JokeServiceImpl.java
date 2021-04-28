package com.purplewisteria.SpringJavaConfiguration.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

	 // User Defined class (ChuckNorrisQuotes). suitable for Java Based Config..
	  private final ChuckNorrisQuotes chuckNorrisQuotes;

	    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
	        this.chuckNorrisQuotes = chuckNorrisQuotes;
	    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
    
    
    
}