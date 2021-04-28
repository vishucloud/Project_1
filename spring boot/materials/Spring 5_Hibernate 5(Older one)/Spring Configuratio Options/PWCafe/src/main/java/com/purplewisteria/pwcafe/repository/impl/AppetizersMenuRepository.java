package com.purplewisteria.pwcafe.repository.impl;

import com.purplewisteria.pwcafe.config.ConfigClass;
import com.purplewisteria.pwcafe.domain.Appetizers;
import com.purplewisteria.pwcafe.domain.Mains;
import com.purplewisteria.pwcafe.domain.Soups;
import com.purplewisteria.pwcafe.repository.MenuRepository;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Repository;

@Repository 
public class AppetizersMenuRepository implements  MenuRepository  {
	
	  @Autowired
	  private ConfigClass configClass; 
	
	@Override
	public Set<Appetizers> setOfAppetizers() {
		
		String item1= configClass.getEnv().getProperty("appetizers.item1");
		
		double itemPrice1 = Double.parseDouble(configClass.getEnv().getProperty("appetizers.itemPrice1"));
			
		Set <Appetizers> setOfAppetizers =  new TreeSet<Appetizers>(Comparator.comparing( (Appetizers appetizers) -> appetizers.getAppetizerName() ) );
						setOfAppetizers.add(new Appetizers(item1, itemPrice1));
						setOfAppetizers.add(new Appetizers("MIXED SALAD", 11.00));
						setOfAppetizers.add(new Appetizers("SHRIMP SALAD", 14.00));
						setOfAppetizers.add(new Appetizers("NACHOS", 08.00));
						
						setOfAppetizers.add(new Appetizers("POTATO BOATS", 19.50));
		return setOfAppetizers;
	}

	@Override
	public Set<Mains> setOfMains() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Soups> setOfSoups() {
		// TODO Auto-generated method stub
		return null;
	}

}
