package second_practice.advanced03.oop02.inheritance.practiceMain;

import second_practice.advanced03.oop02.inheritance.practice.Smartphone;

public class DeviceMain {
    public static void main(String[] args) {
        Smartphone iphone = new Smartphone("Iphone pm 18", 50, 0);

        iphone.turnOn();
        iphone.takePhoto();
    }
}