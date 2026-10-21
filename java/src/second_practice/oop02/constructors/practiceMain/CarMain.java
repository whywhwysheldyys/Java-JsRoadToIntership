package second_practice.oop02.constructors.practiceMain;

import second_practice.oop02.constructors.practice.Car;

public class CarMain {
    public static void main(String[] args) {
        Car carFirst = new Car();
        Car carSecond = new Car("Tesla", "Model S", 2019);

        carFirst.printInfo();
        carSecond.printInfo();
    }
}