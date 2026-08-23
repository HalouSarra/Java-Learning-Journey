package advanced;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args){
        // Generics = A concept where you can write a class, interface, or method
        //            that is compatible with different data types.
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String> type argument (specifies the type)

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        System.out.println(fruits);

        Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();
        box1.setItem("banana");
        System.out.println(box1.getItem());

        box2.setItem(3);
        System.out.println(box2.getItem());

        Product<String, Double> product1 = new Product<>("apple", 0.50);
        Product<String, Integer> product2 = new Product<>("ticket", 15);


        System.out.println(product1.getItem() + " " + product1.getPrice());
        System.out.println(product2.getItem() + " " + product2.getPrice());






    }
}