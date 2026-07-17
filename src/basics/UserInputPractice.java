package basics;

import java.util.Scanner;

public class UserInputPractice {
    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
////        String name = scanner.next(); //does not read spaces
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("Enter is your gpa score: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("Are you a student? (true/false): ");
//        boolean isStud = scanner.nextBoolean();
//
//
//        System.out.println("Hello " + name);
//        System.out.println("You are "+ age + " years old");
//        System.out.println("Your gpa is: "+ gpa);
//        System.out.println("Student: "+isStud);
//
//        if(isStud){
//            System.out.println("You are enrolled as a student!");
//        }
//        else {
//            System.out.println("You are not enrolled");
//        }
        
//########## Common issues ##########
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.print("Enter your age: ");
//        int age2 = scanner1.nextInt();
//        scanner1.nextLine();
//        System.out.print("Enter your favorite color: ");
//        String color = scanner1.nextLine();
//
//
//        System.out.println("You are " + age2 +" years old.");
//        System.out.println("You like the color " + color +".");
//
//
//        scanner.close();
//        scanner1.close();

//########## Calculate area of a rectangle ##########
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter the width: ");
        width= scanner2.nextDouble();

        System.out.print("Enter the height: ");
        height= scanner2.nextDouble();

        area= width*height;
        System.out.println("The area is: " + area +"cm²");






        scanner2.close();





    }
}
