package controlflow;

public class Varargs {
    public static void main(String[] args){
        // variable arguments = allows a method to accept a varying type of arguments
        //                      makes methods more flexible, no need for overloaded methods
        //                      java will pack arguments into an array
        //                      ... (ellipsis)

        System.out.println(add(1,2,3,4,5,6));
        System.out.println(average(1,2,3,4,5,6));

    }
    static double add(double... number){
        double sum = 0;
        for(double n:number){
            sum +=n;
        }
        return sum;
    }
    static double average(double... number){
        double sum = add(number);
        if(number.length == 0){
            return 0;
        }
        return sum / number.length;
    }
}
