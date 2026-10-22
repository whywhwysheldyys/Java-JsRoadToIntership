package second_practice.advanced03.oop02.constructors.practice;

public class UserProfile {
    private String username;
    private String email;
    private int age;
    private boolean isActive;

    public UserProfile(String username, String email, int age, boolean isActive) {
        this.username = username;
        this.email = email;
        this.age = age;
        this.isActive = isActive;
    }

    public UserProfile(String username, String email) {
        this(username, email, 18, true);
    }

    public UserProfile(String username) {
        this(username, "not_provided@mail.com");
    }

    public void displayInfo() {
        System.out.println("Имя пользователя: " + username + "\n"
                            + "Почта: " + email + "\n"
                            + "Возраст: " + age + "\n"
                            + "Активен ли: " + isActive);
    }
}