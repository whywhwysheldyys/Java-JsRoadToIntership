package second_practice.advanced03.oop02.polymorphism.practice;

public class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Гав - гав");
    }

    public void bringStick() {
        System.out.println("Собака принесла палку!");
    }
}