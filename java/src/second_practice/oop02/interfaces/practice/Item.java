package second_practice.oop02.interfaces.practice;

import second_practice.oop02.interfaces.practiceAbstract.GameObject;
import second_practice.oop02.interfaces.practiceInterface.Renderable;

public class Item extends GameObject implements Renderable {
    public Item(int x, int y) {
        super(x, y);
    }

    @Override
    public void render() {
        System.out.println("Предмет был отрисован на [x, y]");
    }
}