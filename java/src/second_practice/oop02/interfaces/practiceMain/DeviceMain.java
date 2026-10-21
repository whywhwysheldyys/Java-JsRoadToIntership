package second_practice.oop02.interfaces.practiceMain;

import second_practice.oop02.interfaces.practice.SmartTV;

public class DeviceMain {
    public static void main(String[] args) {
        SmartTV samsung = new SmartTV();

        samsung.turnOn();
        samsung.checkStatus();
        samsung.turnOff();
    }
}