package stringmethods;

public class StringMethods {
    public static void main(String[] args){
        String name = "Sarra HALOU";
        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf('H');
        int lastIndex = name.lastIndexOf('a');
        String name1 = name.toUpperCase();
        String name2 = name.toLowerCase();
        String name3 = "     Sarra HALOU     ";
        String name4 = name3.trim();
        String name5 = name.replace('S','T');

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);
        if (name.isEmpty()){
            System.out.println("Your name is Empty");
        }
        else {
            System.out.println("Hello " + name);
        }

        if(name.contains(" ")){
            System.out.println("Your name contains a space!");
        }
        else {
            System.out.println("Your name DOESN'T contains any spaces!");
        }

        if(name.equals("password")){//consider Upper/Lower cases.
            System.out.println("Your name can't be password");
        }
        else {
            System.out.println("Hello " + name);
        }
    }
}