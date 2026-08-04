package arrays;

public class Arrays {
    public static void main(){
        // array = a collection of value of the same data type
        String[] fruits = {"apple", "orange", "banana", "coconut", "apple"};
        fruits[0] = "pineapple";

        for (int i = 0; i < fruits.length; i++){
            System.out.print(fruits[i] + " ");
        }
        System.out.println();

        java.util.Arrays.sort(fruits);
        for (String fruit:fruits){
            System.out.print(fruit + " ");
        }
        System.out.println();

        java.util.Arrays.fill(fruits,"Watermelon");
        for (String fruit:fruits){
            System.out.print(fruit + " ");
        }

    }
}
