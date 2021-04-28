package com.purplewisteria.CompositionEncapsulationPolymorphism.polymorphism.ex02;

public class CarDemo {

    public static void main(String[] args) {
    	Car car;
  
    	car = new  Ferrari(6, "812 Superfast");
    	
    	System.out.println("Model: " + car.getName());  // calling the inherited methods...
    	System.out.println("Cylinders: " + car.getCylinders()); // calling the inherited methods...
        System.out.println(car.power());
        System.out.println(car. acceleration());
        System.out.println(car.brake());
        System.out.println("-------------------------------------------------------------" +"\n");

        car  = new  Mustang (6, "2018 FORD MUSTANG ECOBOOST® FASTBACK");
        
    	System.out.println("Model: " + car.getName());  // calling the inherited methods...
    	System.out.println("Cylinders: " + car.getCylinders()); // calling the inherited methods...
        System.out.println(car.power());
        System.out.println(car.acceleration());
        System.out.println(car.brake());
        System.out.println("-------------------------------------------------------------" +"\n");

        car = new Lamborghini(6, "AVENTADOR S ROADSTER");
    	System.out.println("Model: " + car.getName());  // calling the inherited methods...
    	System.out.println("Cylinders: " + car.getCylinders()); // calling the inherited methods...
        System.out.println(car.power());
        System.out.println(car.acceleration());
        System.out.println(car.brake());
    }


}
