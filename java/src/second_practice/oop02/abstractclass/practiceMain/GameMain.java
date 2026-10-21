package second_practice.oop02.abstractclass.practiceMain;

import second_practice.oop02.abstractclass.practice.Mage;
import second_practice.oop02.abstractclass.practice.Warrior;

public class GameMain {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Воин", 100);
        Mage mage = new Mage("Маг", 70);


        warrior.attack(mage);
    }
}