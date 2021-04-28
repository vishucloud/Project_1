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
public class SoupsMenuRepository implements  MenuRepository  {

	@Override
	public Set<Soups> setOfSoups() {
		
		Set <Soups> setOfSoups =  new TreeSet<Soups>(Comparator.comparing( (Soups soups) -> soups.getSoupName() ) );
		setOfSoups.add(new Soups("Chicken Noodle Soup", 08.00));
		setOfSoups.add(new Soups("Beef Noodle Soup", 06.00));
		setOfSoups.add(new Soups("SHRIMP SALAD", 09.00));
		setOfSoups.add(new Soups("Chicken & Corn Noodle Soup", 12.00));
		setOfSoups.add(new Soups("POTATO WEDGES", 11.00));
		setOfSoups.add(new Soups("Won Ton Noodle Soup", 07.50));
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