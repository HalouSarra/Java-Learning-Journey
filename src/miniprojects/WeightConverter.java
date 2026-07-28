package miniprojects;

import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args){
        double weightKg,weightLbs,result;
        int choice;
        Scanner scanner = new Scanner(System.in);

        System.out.println("========Welcome to the Weight Conversion Program========");

        System.out.println("You have to conversion choices:");
        System.out.println("1- Convert lbs to kgs.");
        System.out.println("2- Convert kgs to lbs.");
        System.out.print("Enter your conversion choice (1/2):");
        choice = scanner.nextInt();
        if (choice == 1 || choice == 2){
            if (choice == 1){
                System.out.print("Enter your weight in lbs: ");
                weightLbs = scanner.nextDouble();
                result = weightLbs / 2.20462;
//                result = weightLbs * 0.453592;
            }
            else {
                System.out.print("Enter your weight in kg: ");
                weightKg = scanner.nextDouble();
                result = weightKg * 2.20462;
            }
            System.out.printf("Your converted weight (lbs/kg) or (kg/lbs) is: %.2f",result);
        }
        else {
            System.out.println("Your Entered choice is not valid!");
        }

        scanner.close();
    }
}