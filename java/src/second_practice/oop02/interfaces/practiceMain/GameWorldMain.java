package second_practice.oop02.interfaces.practiceMain;

import second_practice.oop02.interfaces.practice.Item;
import second_practice.oop02.interfaces.practice.Player;
import second_practice.oop02.interfaces.practiceInterface.Renderable;

public class GameWorldMain {
    public static void main(String[] args) {
        Renderable[] gameProcess = {
                new Player(4, 5),
                new Item(5, 6)
        };

        for (Renderable game : gameProcess) {
            game.render();
        }
    }
}