package second_practice.advanced03.basics01.controlflow.practiceMain;

import second_practice.advanced03.basics01.controlflow.practice.User;

import java.util.List;

public class ShortCircuitValidator {
    public static boolean validateUser(User user) {
        if (user != null && !user.getName().isEmpty() && user.isActive() == true && !user.getRoles().isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        User userFirst = new User("Ivan", true, List.of("Developer"));
        User userSecond = new User("", true, List.of("Developer"));

        System.out.println(validateUser(userFirst));
        System.out.println(validateUser(userSecond));
    }
}