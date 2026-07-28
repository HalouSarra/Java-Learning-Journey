package controlflow;

public class TernaryOperator {
    public static void main(String[] args){

        // ternary operator ? = Return 1 or 2 values if a condition is true
        // variable = (condition) ? ifTrue : ifFalse;

      int score = 70;
      String passOrFail = (score >= 60) ? "PASS" : "FAIL";
      System.out.println(passOrFail);

        int number = 12;
        String evenOrOdd = (number % 2 == 0) ? "EVEN":"ODD";
        System.out.println(evenOrOdd);

        int hours = 9;
        String timeOfDay = (hours >= 12) ? "P.M.":"A.M.";
        System.out.println(timeOfDay);

        int income = 60000;
        double taxRate = (income >= 40000) ? 0.25:0.15;
        System.out.println(taxRate);
    }
}