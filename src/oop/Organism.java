package oop;

public abstract class Organism {
    boolean isAlive;

    Organism(){
        isAlive = true;
    }

    public abstract void speak();
}
