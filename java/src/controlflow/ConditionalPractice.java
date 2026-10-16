package controlflow;

public class ConditionalPractice {
    public static void main(String[] args) {
        int mark = 4;

        switch (mark) {
            case 5: {
                System.out.println("Отлично");
                break;
            }
            case 4: {
                System.out.println("Хорошо");
                break;
            }
            case 3: {
                System.out.println("Удовлетворительно");
                break;
            }
            default: {
                System.out.println("Пересдача");
            }
        }
    }
}