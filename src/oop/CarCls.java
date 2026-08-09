package oop;

public class CarCls {
    String make;
    String model;
    int year;
    String color;


    CarCls(String model, String color){
        this.model = model;
        this.color = color;
    }
    CarCls(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive the " + this.color + " " + this.model);
    }

    @Override
    public String toString() {
        return color + " " + year + " " + make + " " + model;
    }
}
