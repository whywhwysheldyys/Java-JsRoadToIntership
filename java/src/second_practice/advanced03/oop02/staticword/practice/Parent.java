package second_practice.advanced03.oop02.staticword.practice;

public class Parent {
    public static void showMessage() {
        System.out.println("Статический метод из Parent");
    }

    public void showInstanceMessage() {
        System.out.println("Обычный метод из Parent");
    }
}