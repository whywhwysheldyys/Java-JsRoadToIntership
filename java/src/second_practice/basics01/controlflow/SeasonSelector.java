package second_practice.basics01.controlflow;

public class SeasonSelector {
    public static void main(String[] args) {
        int seasonNum = 3;

        switch (seasonNum) {
            case 3, 4, 5: {
                System.out.println("Весна");
                break;
            }
            case 6, 7, 8: {
                System.out.println("Лето");
                break;
            }
            case 9, 10, 11: {
                System.out.println("Осень");
                break;
            }
            case 12, 1, 2: {
                System.out.println("Зима");
                break;
            }
            default: {
                System.out.println("Введите корректный номер месяца");
            }
        }
    }
}