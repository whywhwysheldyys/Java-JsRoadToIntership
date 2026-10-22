package second_practice.advanced03.oop02.modifiers.practiceMain;

import second_practice.advanced03.oop02.modifiers.practice.ImmutableConfig;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableConfig config = new ImmutableConfig("Qqwqw", 121231);

        System.out.println(config.getAppName());
        System.out.println(config.getMaxUsers());
    }
}