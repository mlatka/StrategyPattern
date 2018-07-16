package edu.mirek;

public class QuackSound implements SoundInterface {
    @Override
    public void makeSound() {
        System.out.println("Quack, quack ...");
    }
}
