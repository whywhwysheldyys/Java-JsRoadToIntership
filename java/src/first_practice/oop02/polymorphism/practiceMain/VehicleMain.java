package first_practice.oop02.polymorphism.practiceMain;

import first_practice.oop02.polymorphism.practice.Car;

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("Mazda" , 2010, 4);
        car.displayInfo();
    }
}