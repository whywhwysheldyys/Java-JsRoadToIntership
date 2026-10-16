package exceptions.practice;

public class UserValidator {
    private int age;

    public UserValidator(int age) {
        this.age = age;
    }

    public static void validateAge(int age) {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Возраст введен некорректно: " + age);
        } else {
            System.out.println("Проверка прошла успешно");
        }
    }
}