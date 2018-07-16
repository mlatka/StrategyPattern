package edu.mirek;

public class DuckTester {
    public static void main(String[] args) {

        Duck duck1 = new WildDuck();
        Duck duck2= new RubberDuck();

        duck1.fly();
        duck2.fly();

        duck1.display();
        duck2.display();

    }
}
