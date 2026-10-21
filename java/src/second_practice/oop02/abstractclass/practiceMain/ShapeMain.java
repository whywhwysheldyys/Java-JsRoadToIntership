package second_practice.oop02.abstractclass.practiceMain;

import second_practice.oop02.abstractclass.practice.Circle;
import second_practice.oop02.abstractclass.practice.Rectangle;
import second_practice.oop02.abstractclass.practice.Shape;

public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("Green", 5),
                new Rectangle("Blue", 4, 3)
        };

        for (Shape shape : shapes) {
            System.out.printf("%.2f\n", shape.calculateArea());
        }
    }
}