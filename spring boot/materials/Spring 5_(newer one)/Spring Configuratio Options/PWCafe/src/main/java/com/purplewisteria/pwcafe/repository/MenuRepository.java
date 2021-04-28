package com.purplewisteria.pwcafe.repository;

import java.util.Set;

import com.purplewisteria.pwcafe.domain.Appetizers;
import com.purplewisteria.pwcafe.domain.Mains;
import com.purplewisteria.pwcafe.domain.Soups;

public abstract interface MenuRepository {
	

	public abstract Set <Appetizers> setOfAppetizers();
	
	public abstract  Set <Soups> setOfSoups();
	
	public abstract Set <Mains> setOfMains();

}