package controlflow;

public class OverloadedMethods {
    public static void main(String[] args){
        // overloaded methods = methods that share the same name,
        //                      but different parameters
        //                      signature = name + parameters
        System.out.println(add(1, 2, 3));
        System.out.println(add(1.0, 2.0));

        String pizza = bakePizza("flat bread","mozzarella", "pepperoni");
        System.out.println(pizza);
    }
    static double add(double a, double b){
        return a + b;
    }
    static int add(int a, int b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
    static int add(int a, int b, int c){
        return a + b + c;
    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";
    }
}