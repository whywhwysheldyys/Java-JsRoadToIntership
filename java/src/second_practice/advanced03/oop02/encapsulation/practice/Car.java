package second_practice.advanced03.oop02.encapsulation.practice;

public class Car {
    private String brand;
    private int speed;

    public Car(String brand, int speed) {
        this.brand = brand;
        setSpeed(speed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            System.out.println("Значение скорость не может быть меньше 0!");
        } else {
            this.speed = speed;
        }
    }
}