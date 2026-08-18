package advanced;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylists {
    public static void main(String[] args){
        // ArrayList = A resizeable array that stores objects (autoboxing);
        //             Arrays are fixed in size, but ArrayLists can change.

        ArrayList<Integer> list1 = new ArrayList<>(); //appropriate wrapper class to store primitives
        list1.add(3);
        list1.add(1);
        list1.add(2);

        ArrayList<Double> list2 = new ArrayList<>(); //appropriate wrapper class to store primitives
        list2.add(3.14);
        list2.add(1.99);
        list2.add(2.01);

//        System.out.println(list1);
//        System.out.println(list2);

        ArrayList<String> fruits = new ArrayList<>(); //appropriate wrapper class to store primitives
        fruits.add("Watermelon");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");

//        fruits.remove(2);
//        fruits.set(0, "plums");

//        System.out.println(fruits.get(1));
//        System.out.println(fruits.size());

//        System.out.println(fruits);
//
//        Collections.sort(fruits);
//
//        System.out.println(fruits);
//
//        for (String fruit : fruits){
//            System.out.print(fruit + " ");
//        }

        //Exercise
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine(); //Clear the input buffer
        for (int i = 1; i <= numOfFood; i++){
            System.out.print("Enter food number " + i +": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);




        scanner.close();
    }
}