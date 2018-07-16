package edu.mirek;

public class ICannotFly implements FlyInterface {
    @Override
    public void fly() {
        System.out.println("If I want to fly I buy a plane ticket ...");
    }
}
