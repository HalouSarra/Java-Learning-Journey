package oop;

public abstract class Animal extends Organism{

    void eat(){
        System.out.println("The animal is eating");
    }

    void move(){
        System.out.println("The animal is running");
    }

    @Override
    public void speak(){
        System.out.println("Animals have sounds");
    }
}
