package oop;

public class WrapperClasses {
    public static void main(String[] args){
        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object.
        //                   Allows use of Collections Framework and static Utility Methods.

//        int a = 123;
        // using wrapper class
//        Integer a = new Integer(123);

        //Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;
        String e = "Pizza";

        //Unboxing
        int x = a;
        double y = b;

        //**********
        //rapper classes utility methods
        //**********
         String f = Integer.toString(123);
         String g = Double.toString(3.14);
         String h = Character.toString('@');
         String i = Boolean.toString(true);
         String j = f + g + h + i;

//        System.out.println(j);

        //parsing
        int aa = Integer.parseInt("1234");
        double bb = Double.parseDouble("120.5");
        char cc = "Pizza".charAt(0);
        boolean dd = Boolean.parseBoolean("true");

        //
        char letter = 'b';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
    }
}
