package arrays;

import java.util.Scanner;

public class SearchAnArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        int target = 5;
        boolean isFound = false;

        String[] fruits = {"apple", "orange", "banana"};
        System.out.print("Enter a fruit to search for: ");
        String targetS = scanner.nextLine();
        boolean isFoundS = false;

        for(int i = 0; i < numbers.length; i++){
            if(target == numbers[i]){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("Element not found in the array");
        }

        for(int i = 0; i < fruits.length; i++){
            if(targetS.equals(fruits[i])){
                System.out.println("Element found at index: " + i);
                isFoundS = true;
                break;
            }
        }
        if (!isFoundS){
            System.out.println("Element not found in the array");
        }

        scanner.close();
    }
}