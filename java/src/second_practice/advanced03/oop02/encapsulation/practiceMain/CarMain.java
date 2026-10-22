package second_practice.advanced03.oop02.encapsulation.practiceMain;

import second_practice.advanced03.oop02.encapsulation.practice.Car;

public class CarMain {
    public static void main(String[] args) {
        Car audi = new Car("Audi", 150);

        audi.setBrand("BMW");
        System.out.println(audi.getBrand());

        audi.setSpeed(-130);
        System.out.println(audi.getSpeed());
    }
}