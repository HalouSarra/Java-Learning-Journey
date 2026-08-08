package oop;

public class CarCls {
    String model;
    String color;

    CarCls(String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive the " + this.color + " " + this.model);
    }
}
