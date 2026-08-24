package advanced;

import java.util.Scanner;

public class Threading {
    public static void main(String[] args){
        // Threading = Allows a program to run multiple tasks simultaneously
        //             Helps improve performance with time-consuming operations
        //             (File I/O, network communications, or ant background tasks)

        // How to creat a Thread
        // Option 1. Extend the thread class (simpler)
        // Option 2. Implement the Runnable interface (better)

        //Running our program on the main thread
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have 10 seconds to enter your name");

//        for(int i = 1; i <= 5; i++) {
//            try {
//                Thread.sleep(1000); // Current thread we're working with
//            }
//            catch (InterruptedException e){
//                System.out.println("Thread was interrupted");
//            }
//            if(i == 5){
//                System.out.println("Time's up!");
//            }
//        }

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);// this thread will end as soon our main thread is finished
        thread.start();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        // The solution uo does not work because every thing is running in our main thread
        // Our main thread is waiting for the loop to finish and then ask the user to enter their name
        // Sol: a thread to count to 5 and our main thread in charge of accepting user input

        //The program will not exit util all threads are done
        // Unless you use Damon thread



        scanner.close();
    }
}