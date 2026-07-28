package stringmethods;

import java.util.Scanner;

public class Substrings {
    public static void main(String[] args){
        //.substring() - A method used to extract a portion of a string
        // .substring(start, end)
        String email;
        String username;
        String domain;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0,email.indexOf('@'));
            domain = email.substring(email.indexOf('@')+1);
            System.out.println(username);
            System.out.println(domain);
        }
        else {
            System.out.println("Emails must contain @");
        }









    }
}