package second_practice.advanced03.oop02.staticword.practice;

public class Child extends Parent{
    public static void showMessage() {
        System.out.println("Статический метод из Child");
    }

    @Override
    public void showInstanceMessage() {
        System.out.println("Обычный метод из Child");
    }
}