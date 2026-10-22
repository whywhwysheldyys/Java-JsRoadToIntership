package second_practice.advanced03.oop02.polymorphism.practiceMain;

import second_practice.advanced03.oop02.polymorphism.practice.Animal;
import second_practice.advanced03.oop02.polymorphism.practice.Cat;
import second_practice.advanced03.oop02.polymorphism.practice.Cow;
import second_practice.advanced03.oop02.polymorphism.practice.Dog;

public class ZooMain {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Cow(),
                new Dog()
        };

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Dog) {
                ((Dog) animals[i]).bringStick();
            } else if (animals[i] instanceof Cat) {
                ((Cat) animals[i]).catchMouse();
            } else {
                animals[i].makeNoise();
                System.out.println("Уникальных действий нет!");
            }

        }
    }
}