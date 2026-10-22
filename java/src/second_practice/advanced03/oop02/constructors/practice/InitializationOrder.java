package second_practice.advanced03.oop02.constructors.practice;

public class InitializationOrder {
    private int a = print("1. Инциализация поля а");

    {
        System.out.println("2. Нестатический блок инициализации");
    }

    public InitializationOrder() {
        System.out.println("3. Выполнение конструктора");
    }

    public static int print(String msg) {
        System.out.println(msg);
        return 1;
    }
}