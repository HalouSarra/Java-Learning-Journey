package advanced;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        //The code will run in a separate thread
        for(int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000); // Current thread we're working with
            }
            catch (InterruptedException e){
                System.out.println("Thread was interrupted");
            }
            if(i == 10){
                System.out.println("Time's up!");
                System.exit(0); // end the program
            }
        }


    }
}
