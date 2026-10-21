package first_practice.basics01.methods.practice;

public class Car {
    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Бренд: " + brand + "\n"
                            + "Год выпуска: " + year);
    }
}