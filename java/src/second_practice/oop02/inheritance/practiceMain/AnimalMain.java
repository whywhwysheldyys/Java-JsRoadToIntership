package second_practice.oop02.inheritance.practiceMain;

import second_practice.oop02.inheritance.practice.Animal;
import second_practice.oop02.inheritance.practice.Cat;
import second_practice.oop02.inheritance.practice.Dog;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animalsList = {
                new Cat("Murzik"),
                new Dog("Bobik"),
                new Dog("Alfredo"),
                new Cat("Felix")
        };

        for (Animal animal : animalsList) {
            animal.makeSound();
        }
    }
}