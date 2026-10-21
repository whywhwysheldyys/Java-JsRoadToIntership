package second_practice.oop02.composition.practiceMain;

import second_practice.oop02.composition.practice.Computer;
import second_practice.oop02.composition.practice.Processor;
import second_practice.oop02.composition.practice.RAM;

public class ComputerMain {
    public static void main(String[] args) {
        Processor intel = new Processor("I7 - 7700k", 5.5);
        RAM hyperx = new RAM(16, "DDR5");

        Computer gamingPC = new Computer("Игровой ПК", intel, hyperx);

        gamingPC.printSpecifications();
    }
}