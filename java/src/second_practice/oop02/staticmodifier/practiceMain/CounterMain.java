package second_practice.oop02.staticmodifier.practiceMain;

import second_practice.oop02.staticmodifier.practice.Counter;

public class CounterMain {
    public static void main(String[] args) {
        Counter counterFirst = new Counter("first");
        Counter counterSecond = new Counter("second");
        Counter counterThird = new Counter("third");
        Counter counterFourth = new Counter("fourth");

        System.out.println(Counter.getCount());
    }
}