package inheritance.practiceMain;

import inheritance.practice.Cat;
import inheritance.practice.Dog;

public class ZooMain {
    public static void main(String[] args) {
        Dog bobik = new Dog("Bobik", 12);
        Cat boris = new Cat("Boris", 11);

        bobik.makeNoise();
        boris.makeNoise();
    }
}