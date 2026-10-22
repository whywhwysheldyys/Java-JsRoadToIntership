package second_practice.advanced03.basics01.controlflow.practiceMain;

import java.util.Scanner;

public class SmartMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        mainMenu:
            while (true) {
                System.out.println("Открыть настройки - 1");
                System.out.println("О программе - 2");
                System.out.println("Выход из программы - 0");

                int userOpinion = input.nextInt();

                switch (userOpinion) {
                    case 1 -> {
                        while(true) {
                            System.out.println("Изменить громкость - 1");
                            System.out.println("Сменить язык - 2");
                            System.out.println("Вернуться в главное меню");

                            userOpinion = input.nextInt();

                            switch (userOpinion) {
                                case 1 -> System.out.println("Громкость изменена");
                                case 2 -> System.out.println("Язык изменен");
                                case 0 -> {
                                    break mainMenu;
                                }
                            }
                      }
                    }

                    case 2 -> System.out.println("Программа:Умное Меню \nВерсия 1.0");
                    case 0 -> {
                        break mainMenu;
                    }
                }
            }
    }
}