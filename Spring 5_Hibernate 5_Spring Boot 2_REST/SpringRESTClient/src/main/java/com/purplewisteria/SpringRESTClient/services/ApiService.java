package com.purplewisteria.SpringRESTClient.services;


import com.purplewisteria.SpringRESTClient.domain.Quote;

import java.util.List;

import com.purplewisteria.SpringRESTClient.domain.Album;

public interface ApiService {

	 Quote getQuote ();

	Album [] getAlbums();
}
