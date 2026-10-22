package second_practice.advanced03.basics01.methods.practiceMain;

import second_practice.advanced03.basics01.methods.practice.User;
import second_practice.advanced03.basics01.methods.practice.ValuePassAnalyzer;

public class ValueMain {
    public static void main(String[] args) {
        int number = 10;

        ValuePassAnalyzer.modifyPrimitive(number);
        System.out.println(number); //не изменилось

        User userFirst = new User("Alex");
        ValuePassAnalyzer.modifyObjectState(userFirst);
        System.out.println(userFirst.getName()); //изменилось

        User userSecond = new User("Bob");
        ValuePassAnalyzer.reassignReference(userSecond);
        System.out.println(userSecond.getName()); //не изменилось
    }
}