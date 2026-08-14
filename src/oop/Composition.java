package oop;

public class Composition {
    public static void main(String[] args){
        // Composition = Represent a "part-of" relationship between objects.
        //               For example, an Engine is "part of" a Car.
        //               Allows complex objects to be constructed from smaller objects.

        Car3 car = new Car3("Corvette", 2025, "V8");
        System.out.println(car.model + " " + car.year + " " + car.engine.type);

        car.start();

    }
}
