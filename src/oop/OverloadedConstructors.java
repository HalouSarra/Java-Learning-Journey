package oop;

public class OverloadedConstructors {
    public static void main(String[] args){
        // overloaded constructors = Allow a  class to have multiple constructors
        //                           with different parameters lists.
        //                           Enable objects to be initialized in various ways.

        User user1 = new User("SpongeBob");
        User user2 = new User("Patrick", "patrick123@gmail.com");
        User user3 = new User("Sandy", "sandycheeks2@gmail.com", 27);
        User user4 = new User();

        System.out.println(user1.username + " " + user1.email + " " + user1.age);
        System.out.println(user2.username + " " + user2.email + " " + user2.age);
        System.out.println(user3.username + " " + user3.email + " " + user3.age);
        System.out.println(user4.username + " " + user4.email + " " + user4.age);
    }
}