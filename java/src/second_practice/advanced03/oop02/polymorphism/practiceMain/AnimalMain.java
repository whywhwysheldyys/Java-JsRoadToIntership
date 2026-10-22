package second_practice.advanced03.oop02.polymorphism.practiceMain;

import second_practice.advanced03.oop02.polymorphism.practice.Animal;
import second_practice.advanced03.oop02.polymorphism.practice.Cat;
import second_practice.advanced03.oop02.polymorphism.practice.Cow;
import second_practice.advanced03.oop02.polymorphism.practice.Dog;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Cow()
        };

        for (Animal animal : animals) {
            animal.makeNoise();
        }
    }
}