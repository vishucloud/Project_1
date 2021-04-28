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
public class MainsMenuService  implements MenuService {
	
	private MenuRepository menuRepository; 

	@Autowired
	public MainsMenuService(@Qualifier("mainsMenuRepository") MenuRepository menuRepository) {
		super();
		this.menuRepository = menuRepository;
	}


	@Override
	public Set<Mains> setOfMains() {
		
		Set <Mains> setOfMains =  menuRepository.setOfMains(); 
		
		return setOfMains;
	}


	@Override
	public Set<Appetizers> setOfAppetizers() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Set<Soups> setOfSoups() {
		// TODO Auto-generated method stub
		return null;
	} 
	

}
