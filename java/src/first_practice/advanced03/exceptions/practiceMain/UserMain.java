package first_practice.advanced03.exceptions.practiceMain;

import first_practice.advanced03.exceptions.practice.UserValidator;

public class UserMain {
    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator(12);
        try {
            UserValidator.validateAge(-5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Проверка завершена");
        }
    }
}