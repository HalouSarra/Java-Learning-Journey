package dev_java_reading.getting_to_know_the_language.objects_classes_interfaces_packages_inheritance;

class MountainBike extends Bicycle{
        // new fields and methods defining
}

public class Main {
    public static void main(String[] args){
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}
