package edu.mirek;

public class WildDuck extends Duck {

    public WildDuck(){

        setFlyInterface(new ICanFly());
        setSoundInterface( new QuackSound());

    }

    @Override
    public void display() {
        System.out.println("I am a wild duck");
    }
}
