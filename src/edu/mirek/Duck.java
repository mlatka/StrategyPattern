package edu.mirek;

public abstract class Duck {

    private FlyInterface flyInterface;
    private SoundInterface soundInterface;


    public Duck() {
    }

    public Duck(FlyInterface flyInterface, SoundInterface soundInterface) {
        this.flyInterface = flyInterface;
        this.soundInterface = soundInterface;
    }

    public void setFlyInterface(FlyInterface flyInterface) {
        this.flyInterface = flyInterface;
    }


    public void setSoundInterface(SoundInterface soundInterface) {
        this.soundInterface = soundInterface;
    }

    public void swim(){

        System.out.println("I'm swimming in the rain...");
    }

    public  void makeSound(){

        soundInterface.makeSound();
    }

    public void  fly(){

        flyInterface.fly();
    }


    public abstract  void display();

}
