package oop;

public class ObjectOrientedProgramming {
    public static void main(String[] args){
        // Object = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a reference  data type

        Car car = new Car();
        Car car1 = new Car();
        Car car2 = new Car();

        car.isRunning = true;
        System.out.println(car.make + " " + car.model + " " + car.year + " " + car.price + " " + car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);

        car.drive();
        car.brake();

        //Why constructors?
        System.out.println(car1.make + " " + car1.model + " " + car1.year + " " + car1.price + " " + car1.isRunning);
        System.out.println(car2.make + " " + car2.model + " " + car2.year + " " + car2.price + " " + car2.isRunning);
    }
}
