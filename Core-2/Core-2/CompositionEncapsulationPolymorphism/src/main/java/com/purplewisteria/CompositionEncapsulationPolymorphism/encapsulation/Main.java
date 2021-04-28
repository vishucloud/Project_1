package com.purplewisteria.CompositionEncapsulationPolymorphism.encapsulation;

public class Main {

    public static void main(String[] args) {
    	
    	// EnhancedPlayer  enhancedPlayerPlayer  = new  EnhancedPlayer("Tim", -300, "Sword");
//        player.name = "Tim";      // Bad code...
    	// enhancedPlayerPlayer.hitPoints = -20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health =  " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health =  " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 300, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
