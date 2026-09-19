package dev_java_reading.getting_to_know_the_language.objects_classes_interfaces_packages_inheritance;

public class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int cadenceNewValue){
        cadence = cadenceNewValue;
    }

    void changeGear(int gearNewValue){
        gear = gearNewValue;
    }

    void speedUp(int increment){
        speed += increment;
    }

    void applyBrakes(int decrement){
        speed -= decrement;
    }

    void printStates(){
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}
