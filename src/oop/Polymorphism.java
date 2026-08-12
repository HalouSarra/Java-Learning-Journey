package oop;

public class Polymorphism {
    public static void main(String[] args){
        // Polymorphism = "POLY" = "MANY"
        //                "MORPH" = "SHAPE"
        //                Objects can identify as other objects.
        //                Objects can be treated as objects of a common superclass.
        CarVehicle car = new CarVehicle();
        BikeVehicle bike = new BikeVehicle();
        BoatVehicle boat = new BoatVehicle();

        Vehicle[] vehicles = {car , bike, boat};

        for (Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}