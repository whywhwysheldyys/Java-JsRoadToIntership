package second_practice.advanced03.oop02.staticword.practiceMain;

import second_practice.advanced03.oop02.staticword.practice.User;

public class UserMain {
    public static void main(String[] args) {
        User bob = new User("Bob");
        User alice = new User("Alice");
        User oleg = new User("Oleg");

        System.out.println(bob.getUsername() + " " + bob.getId());
        System.out.println(alice.getUsername() + " " + alice.getId());
        System.out.println(oleg.getUsername() + " " + oleg.getId());

        System.out.println(User.getTotalUsersCount());
    }
}