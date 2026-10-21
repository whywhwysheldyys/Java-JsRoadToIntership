package second_practice.oop02.staticmodifier.practice;

public class Counter {
    private static int count = 0;
    private String objectName;

    public Counter(String objectName) {
        this.objectName = objectName;
        count++;
    }

    public static int getCount() {
        return count;
    }
}