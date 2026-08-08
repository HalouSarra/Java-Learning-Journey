package oop;

public class Static {
    public static void main(String[] args){
        // static = Makes a variable or method belong to the class
        //          rather than to any specific object.
        //          Commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Nesrine");
        Friend friend2 = new Friend("Donia");
        Friend friend3 = new Friend("Yousra");
        Friend friend4 = new Friend("SidAhmed");
        Friend friend5 = new Friend("Abdelkader");

        System.out.println(friend1.name);
        System.out.println(friend1.numOfFriends);
        System.out.println(Friend.numOfFriends); //Best Practice: access a static member from the class not an object.

        Friend.showFriends();

        // static in the Math class
        Math.round(3.99);
        //you do not need to creat am object to use the round() method (is static!)





    }
}