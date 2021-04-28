package com.purplewisteria.CompositionEncapsulationPolymorphism.polymorphism.ex03;

public class Hamburger {
	
	private String breadRollType;
    private String meat;
    private double tomatoPrice;
    private  double carrotPrice;
    private double lettucePrice;
    private double cheesePrice;
    private double HamburgerBasePrice;
    private int lettuceCount =0;
    private int carrotCount = 0;
    private int tomatoCount = 0;
    private int CheeseCount = 0;

    public Hamburger(String breadRollType, String meat, double HamburgerBasePrice) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.HamburgerBasePrice = HamburgerBasePrice;
        this.tomatoPrice = 2.00d;
        this.carrotPrice  = 2.00d;
        this.lettucePrice = 2.00d;
        this.cheesePrice = 5.00d;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public double getCarrotPrice() {
        return carrotPrice;
    }

    public double getLettucePrice() {
        return lettucePrice;
    }

    public double getCheesePrice() {
        return cheesePrice;
    }

    public double getHamburgerBasePrice() {
        return HamburgerBasePrice;
    }
    
    public void resetCounters(){
        lettuceCount = 0;
         carrotCount = 0;
         tomatoCount = 0;
         CheeseCount = 0;
    }

    public double AddLettuce(){
         
        lettuceCount ++;
        return lettuceCount;
    }

    public double AddCarrots(){
        
        carrotCount ++;
        return carrotCount;
    }
    public double AddTomatoes(){
        tomatoCount ++;
        return tomatoCount;
    }

    public double AddCheese(){
        
        CheeseCount ++;
        return CheeseCount;
    }

    public double calculatePrice(){
        double price1;
        double price2;
        double price3;
        double price4;

        double totalPrice;
        if (lettuceCount > 0) {
            
            System.out.println(" Lettuce is Added ");
            price1 = getLettucePrice() * lettuceCount;
        }
        else
            price1 = 0;


        if (carrotCount > 0) {
            
            System.out.println(" Carrots is Added ");
            price2 = getCarrotPrice() * carrotCount;
        }
        else
            price2 = 0;

        if (tomatoCount > 0) {
            
            System.out.println(" Tomatoes is Added ");
            price3 = getTomatoPrice() * tomatoCount;
        }
        else
            price3 = 0;

        if (CheeseCount > 0) {

            System.out.println(" Cheese is Added ");
            price4 = getCheesePrice() * CheeseCount;
        }
        else
            price4 = 0;

        totalPrice = getHamburgerBasePrice() + price1 + price2 + price3 + price4;
        
        resetCounters();
    return  totalPrice;

    }
}
