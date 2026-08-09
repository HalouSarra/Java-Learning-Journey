package oop;

public class Abstraction {
    public static void main(String[] args){
        // abstraction = Used to define abstract classes and methods.
        //               Abstraction is the process of hiding implementation details
        //               and showing only the essential features;
        //               Abstract classes CAN'T be instantiated directly
        //               Can contain 'abstract' method (which must be implemented)
        //               Can contain 'concrete' method (which are inherited)

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 7);

        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}