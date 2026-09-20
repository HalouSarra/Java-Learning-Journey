package dev_java_reading.getting_to_know_the_language.objects_classes_interfaces_packages_inheritance;

public interface BicycleInt {
    //An interface is a group of related methods with empty bodies
    void changeCadence(int cadenceNewValue);

    void changeGear(int gearNewValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}