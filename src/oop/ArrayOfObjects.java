package oop;

public class ArrayOfObjects {
    public static void main(String[] args){
        CarCls car1 = new CarCls("Mustang", "Red");
        CarCls car2 = new CarCls("Corvette", "Blue");
        CarCls car3 = new CarCls("Charger", "Yellow");

        CarCls[] cars = {car1, car2, car3,new CarCls("Picanto", "Black")};

        for (CarCls car : cars) {
            car.drive();
        }
        for (CarCls car : cars) {
            car.color = "Black";
        }
        System.out.println();

        for (CarCls car : cars) {
            car.drive();
        }

    }
}
