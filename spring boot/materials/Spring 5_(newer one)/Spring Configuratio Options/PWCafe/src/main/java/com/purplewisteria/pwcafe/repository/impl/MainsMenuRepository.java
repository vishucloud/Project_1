package com.purplewisteria.pwcafe.repository.impl;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Repository;

import com.purplewisteria.pwcafe.domain.Appetizers;
import com.purplewisteria.pwcafe.domain.Mains;
import com.purplewisteria.pwcafe.domain.Soups;
import com.purplewisteria.pwcafe.repository.MenuRepository;


@Repository
public class MainsMenuRepository implements  MenuRepository  {


	@Override
	public Set<Mains> setOfMains() {
		
		Set <Mains> setOfMains =  new TreeSet<Mains>(Comparator.comparing( (Mains mains) -> mains.getMainsName() ) );
		
		
		setOfMains.add(new Mains("PIZZA MARGHERITA", 19.00));
		setOfMains.add(new Mains("CHICKEN SANDWICH", 23.00));
		setOfMains.add(new Mains("BEEF BURGER", 21.00));
		setOfMains.add(new Mains("VEGETARIAN BURGER", 16.00));
		setOfMains.add(new Mains("STEAK", 17.00));
		setOfMains.add(new Mains("FISH & CHIPS", 25.50));
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
