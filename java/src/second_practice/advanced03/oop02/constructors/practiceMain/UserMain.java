package second_practice.advanced03.oop02.constructors.practiceMain;

import second_practice.advanced03.oop02.constructors.practice.UserProfile;

public class UserMain {
    public static void main(String[] args) {
        UserProfile userFirst = new UserProfile("Oleg");
        UserProfile userSecond = new UserProfile("Anna", "example_mail@mail.com");
        UserProfile userThird = new UserProfile("Den", "denmail@mail.com", 19, true);

        userFirst.displayInfo();
        userSecond.displayInfo();
        userThird.displayInfo();
    }
}