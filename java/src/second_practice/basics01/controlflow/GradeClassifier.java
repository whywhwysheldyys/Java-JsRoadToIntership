package second_practice.basics01.controlflow;

public class GradeClassifier {
    public static void main(String[] args) {
        int studentGrade = 1000;

        if (studentGrade < 0 || studentGrade > 100) {
            System.out.println("Ошибка: введите корректное значение");
        } else if (studentGrade >= 90) {
            System.out.println("A - Отлично");
        } else if (studentGrade >= 75) {
            System.out.println("B - Хорошо");
        } else if (studentGrade >= 60) {
            System.out.println("C - Удовлетворительно");
        } else {
            System.out.println("F - Неудовлетворительно");
        }
    }
}