package com.purplewisteria.CompositionEncapsulationPolymorphism.polymorphism.ex02;

public class Ferrari extends Car {

    public Ferrari(int cylinders, String name) {
        super(cylinders, name);
        
    }

    @Override
    public String power() {
        return "6.5 litre 788.52bhp V12 Petrol Engine" + " | V12 POWERTRAIN" + " | 588 KW(800 CV) at 8,500 rpm";
        		
    }

    @Override
    public String acceleration() {
        return "2.9 SEC" + " 0-100km/h";
        		
    }

    @Override
    public String brake() {
        return "Front 398 mm x 38 mm" + " | Rear 360 mm x 32 mm";
    }
    
}