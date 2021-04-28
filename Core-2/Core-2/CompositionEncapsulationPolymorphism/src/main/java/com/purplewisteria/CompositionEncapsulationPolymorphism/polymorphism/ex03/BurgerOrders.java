package com.purplewisteria.CompositionEncapsulationPolymorphism.polymorphism.ex03;

import com.purplewisteria.CompositionEncapsulationPolymorphism.polymorphism.ex03.DeluxeBurger;
import com.purplewisteria.CompositionEncapsulationPolymorphism.polymorphism.ex03.HealthyBurger;

public class BurgerOrders 
{
    public static void main( String[] args )
    {
    	Hamburger burger;
    	
      burger = new HealthyBurger( "Beacon", 25);
      
      burger.AddLettuce();
       burger.AddCheese();
       burger.AddTomatoes();
       burger.AddLettuce();
       
      HealthyBurger healthyBurger = ( HealthyBurger) burger ;
      
       healthyBurger.AddGualcamole();
  
       healthyBurger.AddSalsa();   
  
     
       System.out.println(" The total healthy " + burger.getBreadRollType() + " with "+ burger.getMeat() + " Price is " + burger.calculatePrice());
       System.out.println("====================================");
        
       
        burger = new DeluxeBurger();        
        burger.AddTomatoes();
        
        
        System.out.println("The deluxeHamburger "+ burger.getBreadRollType()+ " with "+ burger.getMeat()+  " Price is " + burger.calculatePrice());


    }

    }

