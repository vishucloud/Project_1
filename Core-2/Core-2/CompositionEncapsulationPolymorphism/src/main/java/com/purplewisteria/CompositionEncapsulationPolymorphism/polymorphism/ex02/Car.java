package com.purplewisteria.CompositionEncapsulationPolymorphism.polymorphism.ex02;

class Car {
	
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return this.cylinders;
    }

    public String getName() {
        return name;
    }

    public String power() {
        return "Car Power";
    }

    public String  acceleration() {
        return "Car  Acceleration()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

