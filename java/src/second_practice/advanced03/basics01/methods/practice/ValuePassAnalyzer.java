package second_practice.advanced03.basics01.methods.practice;

public class ValuePassAnalyzer {
    public static void modifyPrimitive(int x) {
        x = 99;
    }

    public static void modifyObjectState(User user) {
        user.setName("NewName");
    }

    public static void reassignReference(User user) {
        user = new User("Another user");
    }
}