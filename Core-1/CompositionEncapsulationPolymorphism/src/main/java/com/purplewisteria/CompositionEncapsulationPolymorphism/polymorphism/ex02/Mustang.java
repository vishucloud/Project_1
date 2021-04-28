package com.purplewisteria.CompositionEncapsulationPolymorphism.polymorphism.ex02;

public class Mustang extends Car {
	

    public Mustang(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String power() {
        return "6-speed manual transmission" + " | 10-speed SelectShift® Automatic Transmission" ;
    }

    @Override
    public String acceleration() {
        return "\"4.9 SEC\" + \" 0-100km/h\";";
    }

    @Override
    public String brake() {
        return "12.5 front brake rotors with 2-piston calipers" + " | 12.5 rear brake rotors with single-piston calipers";
    }
}