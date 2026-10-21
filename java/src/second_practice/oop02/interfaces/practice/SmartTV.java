package second_practice.oop02.interfaces.practice;

import second_practice.oop02.interfaces.practiceInterface.Powerable;

public class SmartTV implements Powerable {
    @Override
    public void turnOn() {
        System.out.println("Телевизор включен");
    }

    @Override
    public void turnOff() {
        System.out.println("Телевизор выключен");
    }
}