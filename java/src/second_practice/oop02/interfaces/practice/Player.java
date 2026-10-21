package second_practice.oop02.interfaces.practice;

import second_practice.oop02.interfaces.practiceAbstract.GameObject;
import second_practice.oop02.interfaces.practiceInterface.Renderable;

public class Player extends GameObject implements Renderable {
    public Player(int x, int y) {
        super(x, y);
    }

    @Override
    public void render() {
        System.out.println("Отрисовка игрока на позиции [x, y]");
    }
}