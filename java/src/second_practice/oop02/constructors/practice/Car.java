package second_practice.oop02.constructors.practice;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 2020;
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void printInfo() {
        System.out.println("Бренд: " + brand + "\n"
                            + "Модель: " + model + "\n"
                            + "Год выпуска: " + year);
    }
}