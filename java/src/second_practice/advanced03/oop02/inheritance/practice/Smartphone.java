package second_practice.advanced03.oop02.inheritance.practice;

public class Smartphone extends Device{
    private int cameraMegapixels;
    private int batteryLevel;

    public Smartphone(String model, int cameraMegapixels, int batteryLevel) {
        super(model);
        this.cameraMegapixels = cameraMegapixels;
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void turnOn() {
        if (batteryLevel > 0) {
            super.turnOn();
        } else {
            System.out.println("Батарея видимо разряжен,пожалуйста зарядите устройство");
        }
    }

    public void takePhoto() {
        if (isOn) {
            System.out.println("Щелк - Сделан фотоснимок");
        } else {
            System.out.println("Включите устройство чтобы взаимодействовать с ним");
        }
    }
}