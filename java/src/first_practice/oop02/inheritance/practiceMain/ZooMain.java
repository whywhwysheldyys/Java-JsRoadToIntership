package first_practice.oop02.inheritance.practiceMain;

import first_practice.oop02.inheritance.practice.Cat;
import first_practice.oop02.inheritance.practice.Dog;

public class ZooMain {
    public static void main(String[] args) {
        Dog bobik = new Dog("Bobik", 12);
        Cat boris = new Cat("Boris", 11);

        bobik.makeNoise();
        boris.makeNoise();
    }
}