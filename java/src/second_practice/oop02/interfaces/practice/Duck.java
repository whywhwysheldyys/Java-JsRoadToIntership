package second_practice.oop02.interfaces.practice;

import second_practice.oop02.interfaces.practiceInterface.Flyable;
import second_practice.oop02.interfaces.practiceInterface.Swimmable;

public class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Утка летит!");
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает");
    }
}