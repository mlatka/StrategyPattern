package edu.mirek;

public class SilenceSound implements SoundInterface {
    @Override
    public void makeSound() {
        System.out.println(" I have nothing to say ...");
    }
}
