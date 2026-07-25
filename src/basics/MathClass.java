package basics;
import java.util.Scanner;

public class MathClass {
    public static void main(String[] args){
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;
        result = Math.pow(2,4);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(3.14);
        result = Math.ceil(3.14);
        result = Math.round(3.55);
        result = Math.floor(3.55);
        result = Math.max(10,20);
        result = Math.min(10,20);

        System.out.println(result);

        //HYPOTENUSE c = Math.sqrt(a² + b²)
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();
        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.print("The hypotenuse (side c) is: " + c + "cm");

        //-----------------------//
        Scanner scanner2 = new Scanner(System.in);
        double radius,circumference,area,volume;
        System.out.print("Enter the radius: ");
        radius = scanner2.nextDouble();
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius,2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);

        System.out.printf("The Circumference is: %.2fcm.", circumference);
        System.out.printf("\nThe Area is: %.2fcm².", area);
        System.out.printf("\nThe Volume is: %.2fcm³.", volume);


        scanner.close();
        scanner2.close();
    }
}