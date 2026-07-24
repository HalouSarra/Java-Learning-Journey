package controlflow;
import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args){
        //if statement = performs a block of code of its condition is true
        Scanner scanner = new Scanner(System.in);

        int age;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if(age >= 18 && age < 65){
            System.out.println("You are an adult!");
        }
        else if(age < 0){
            System.out.println("You haven't been born yet!");
        }
        else if (age == 0){
            System.out.println("You are a baby!");
        }
        else if (age >= 65){
            System.out.println("You are a senior!");
        }
        else {
            System.out.println("You are a child!");
        }



        scanner.close();
    }
}