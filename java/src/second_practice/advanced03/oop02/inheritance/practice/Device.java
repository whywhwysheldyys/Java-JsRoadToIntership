package second_practice.advanced03.oop02.inheritance.practice;

public class Device {
    private String model;
    protected boolean isOn;

    public Device(String model) {
        this.model = model;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Включен");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Выключен");
    }
}