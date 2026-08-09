package oop;

public class ToStringMethod {
    public static void main(String[] args){
        // .toString() = Method inherited from the Object class.
        //               Used to return a string representation of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful detail.

        CarCls car1 = new CarCls("Ford", "Mustang", 2025, "Red");
        CarCls car2 = new CarCls("Chevrolet", "Corvette", 2026, "Blue");
        Car car = new Car();

        System.out.println(car);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.toString());// you do not need to write the method name
        System.out.println(car1.color + " " + car1.year + " " + car1.make + " " + car1.model);
    }
}