package edu.mirek;

public class RubberDuck extends Duck {

    public RubberDuck() {

        setFlyInterface(new ICannotFly());
        setSoundInterface(new SqueakSound());
    }

    @Override
    public void display() {
        System.out.println("I am a rubber duck");
    }
}
