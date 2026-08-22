package advanced;

public class AnonymousClasses {
    public static void main(String[] args){
        // Anonymous class = A class that doesn't have a name. Cannot be reused.
        //                   Add custom behavior without having to create a new class.
        //                   Often used for one time uses (TimeTask, Runnable, callbacks)

        // creat anonymous class instead of this
        Dog dog1 = new Dog();
        TalkingDog talkingDog = new TalkingDog();

        //As following
        Dog dog2 = new Dog(){//withing here we can define any unique features or override methods
            @Override
            void speak(){
                System.out.println("Scooby Doo says *Ruh Ruh*");
            }
        };

        dog1.speak();
        talkingDog.speak();
        dog2.speak();
    }
}