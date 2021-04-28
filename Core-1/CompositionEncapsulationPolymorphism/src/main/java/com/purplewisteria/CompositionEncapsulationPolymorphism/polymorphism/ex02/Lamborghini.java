package com.purplewisteria.CompositionEncapsulationPolymorphism.polymorphism.ex02;

public class Lamborghini extends Car {

    public Lamborghini(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String power() {
        return "V12, 60°, MPI (Multi Point Injection" + " | 740 CV (544 KW) @8400 RPM" ;
    }

    @Override
    public String acceleration() {
        return "\"3.0 SEC\" + \" 0-100km/h" +" | (0-62 MPH)";
    }

    @Override
    public String brake() {
        return "Carbon-ceramic brakes with fixed calipers monoblock in aluminum with 6 pistons (front) and 4 pistons (rear)";
    }
}