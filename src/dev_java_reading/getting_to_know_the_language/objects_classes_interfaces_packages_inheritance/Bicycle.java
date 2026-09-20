package dev_java_reading.getting_to_know_the_language.objects_classes_interfaces_packages_inheritance;

public class Bicycle implements BicycleInt{
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    // The compiler will now require that methods
    // changeCadence, changeGear, speedUp, and applyBrakes
    // all be implemented. Compilation will fail if those
    // methods are missing from this class.

    public void changeCadence(int cadenceNewValue){
        cadence = cadenceNewValue;
    }

    public void changeGear(int gearNewValue){
        gear = gearNewValue;
    }

    public void speedUp(int increment){
        speed += increment;
    }

    public void applyBrakes(int decrement){
        speed -= decrement;
    }

    void printStates(){
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}