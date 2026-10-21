package second_practice.oop02.inheritance.practice;

public class Vehicle {
    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void showInfo() {
        System.out.println("Бренд: " + brand + "\n"
                            + "Скорость: " + speed);
    }
}