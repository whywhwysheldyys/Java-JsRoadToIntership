package second_practice.oop02.composition.practiceMain;

import second_practice.oop02.composition.practice.Car;
import second_practice.oop02.composition.practice.Engine;

public class CarMain {
    public static void main(String[] args) {
        Engine v8 = new Engine(120, true);
        Car audi = new Car("Audi", v8);

        audi.startCar();
        audi.stopCar();
    }
}