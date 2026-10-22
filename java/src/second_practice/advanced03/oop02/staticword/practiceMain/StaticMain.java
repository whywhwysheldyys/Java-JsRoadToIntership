package second_practice.advanced03.oop02.staticword.practiceMain;

import second_practice.advanced03.oop02.staticword.practice.Child;
import second_practice.advanced03.oop02.staticword.practice.Parent;

public class StaticMain {
    public static void main(String[] args) {
        Parent obj = new Child();

        obj.showMessage();
        obj.showInstanceMessage();
    }
}