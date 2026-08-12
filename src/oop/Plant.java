package oop;

public class Plant extends Organism{

    void photosynthesize(){
        System.out.println("The plant absorbs sunlight");
    }

    @Override
    public void speak(){
        System.out.println("Plants does not speak!");
    }
}