package second_practice.oop02.encapsulaiton.practice;

public class User {
    private String username;
    private String email;
    private int age;

    public User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        setAge(age);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0 || age >= 120) {
            System.out.println("Введите корректный возраст");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Имя пользователя: " + username + ", Электронная почта: " + email + ", Возраст: " + age;
    }
}