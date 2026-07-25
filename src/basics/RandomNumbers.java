package basics;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args){
        Random random = new Random();
//        int number1,number2,number3;
//        number1 = random.nextInt(1,101);
//        number2 = random.nextInt(1,101);
//        number3 = random.nextInt(1,101);
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(number3);

//        double number;
//        number = random.nextDouble();
//        System.out.println(number);

        boolean isHead;
        isHead = random.nextBoolean();

        if(isHead){
            System.out.println("HEADS");
        }
        else {
            System.out.println("TAILS");
        }















    }
}
