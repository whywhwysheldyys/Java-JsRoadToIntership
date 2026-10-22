package second_practice.advanced03.basics01.methods.practiceMain;

public class RecursiveTracker {
    public static void printDepth(int currentDepth, int maxDepth) {
        if (currentDepth > maxDepth) {
            System.out.println("-> Достигнута максимальная глубина (" + maxDepth + "). Возвращаемся назад!");
            return;
        }

        System.out.println("Прямой ход: текущая глубина стека = " + currentDepth);
        printDepth(currentDepth + 1, maxDepth);
        System.out.println("Обратный ход: выходим из глубины = " + currentDepth);
    }

    public static void main(String[] args) {
        System.out.println("--- Старт рекурсии ---");
        printDepth(1, 5);
        System.out.println("--- Конец программы ---");
    }
}