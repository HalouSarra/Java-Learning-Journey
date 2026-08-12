package oop;

public class Car2 {
    private final String model; // not writable it is fixed!
    private String color;
    private int price;

    Car2(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    String getPrice(){
        return "$" + this.price;
    }

    void setColor(String color){
        this.color = color;
    }
    void setPrice(int price){
        if (price < 0){
            System.out.println("Price can't be less than zero");
        }
        else {
            this.price = price;
        }
    }

}