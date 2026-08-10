package oop;

public class Interfaces {
    public static void main(String[] args){
        // Interface = A blueprint for a class that specifies a set of abstract methods
        //             that implementation classes MUST define
        //             Supports multiple inheritance-like behavior.
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish2 fish = new Fish2();
        fish.flee();
        fish.hunt();
    }
}