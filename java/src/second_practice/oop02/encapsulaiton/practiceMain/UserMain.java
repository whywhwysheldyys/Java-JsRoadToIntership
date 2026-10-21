package second_practice.oop02.encapsulaiton.practiceMain;

import second_practice.oop02.encapsulaiton.practice.User;

public class UserMain {
    public static void main(String[] args) {
        User user = new User("Andrey", "qweqe@gmail.com", 18);

        user.setAge(-12);

        System.out.println(user.toString());
    }
}