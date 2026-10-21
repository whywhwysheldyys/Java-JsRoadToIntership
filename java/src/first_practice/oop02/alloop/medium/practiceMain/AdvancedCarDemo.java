package first_practice.oop02.alloop.medium.practiceMain;

import first_practice.oop02.alloop.medium.practice.AdvancedCar;

public class AdvancedCarDemo {
    public static void main(String[] args) {
        AdvancedCar.Engine engine = new AdvancedCar.Engine("Бензин", 240);
        AdvancedCar car = new AdvancedCar("Mercedes-Benz", "A200", 2010, engine);

        car.displayInfo();

        car.setModel("C200");
        car.setYear(2015);

        System.out.println("\nОбновленная модель: " + car.getModel());
        System.out.println("Обновленный год: " + car.getYear());
    }
}