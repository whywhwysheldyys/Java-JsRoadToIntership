package first_practice.oop02.polymorphism.practice;

public class Vehicle {
    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Бренд: " + brand + "\n"
                            + "Скорость: " + speed);
    }

}