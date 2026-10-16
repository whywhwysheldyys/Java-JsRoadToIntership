package polymorphism.practiceMain;

import polymorphism.practice.Car;

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("Mazda" , 2010, 4);
        car.displayInfo();
    }
}