package second_practice.advanced03.oop02.staticword.practice;

public class User {
    private static int totalUsersCount = 0;
    private int id;
    private String username;

    public User(String username) {
        this.username = username;
        totalUsersCount++;
        this.id = totalUsersCount;
    }

    public static int getTotalUsersCount() {
        return totalUsersCount;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
}