package com.purplewisteria.pwcafe.services.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.purplewisteria.pwcafe.domain.Appetizers;
import com.purplewisteria.pwcafe.domain.Mains;
import com.purplewisteria.pwcafe.domain.Soups;
import com.purplewisteria.pwcafe.repository.MenuRepository;
import com.purplewisteria.pwcafe.services.MenuService;

@Service
public class SoupsMenuService implements MenuService {
	
	private MenuRepository menuRepository; 

	@Autowired
	public SoupsMenuService ( @Qualifier("soupsMenuRepository") MenuRepository menuRepository) {
		super();
		this.menuRepository = menuRepository;
	}


	@Override
	public Set<Soups> setOfSoups() {
		
		Set <Soups> setOfSoups =  menuRepository.setOfSoups(); 
		
		return setOfSoups;
	}



	@Override
	public Set<Appetizers> setOfAppetizers() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Set<Mains> setOfMains() {
		// TODO Auto-generated method stub
		return null;
	} 
	

}
