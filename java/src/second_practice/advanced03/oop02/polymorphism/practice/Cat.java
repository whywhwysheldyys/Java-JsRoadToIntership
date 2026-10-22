package second_practice.advanced03.oop02.polymorphism.practice;

public class Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Мяу");
    }

    public void catchMouse() {
        System.out.println("Кошка поймала мышь!");
    }
}