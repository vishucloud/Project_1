package com.purplewisteria.pwcafe.services;

import java.util.Set;

import com.purplewisteria.pwcafe.domain.Appetizers;
import com.purplewisteria.pwcafe.domain.Mains;
import com.purplewisteria.pwcafe.domain.Soups;

public interface MenuService {
	
    public abstract Set <Appetizers> setOfAppetizers();
	
    public abstract  Set <Soups> setOfSoups();
	
	public abstract Set <Mains> setOfMains();
	


}
