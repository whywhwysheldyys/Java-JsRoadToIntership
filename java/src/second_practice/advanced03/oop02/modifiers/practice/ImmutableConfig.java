package second_practice.advanced03.oop02.modifiers.practice;

public class ImmutableConfig {
    private final String appName;
    private final int maxUsers;

    public ImmutableConfig(String appName, int maxUsers) {
        this.appName = appName;
        this.maxUsers = maxUsers;
    }

    public String getAppName() {
        return appName;
    }

    public int getMaxUsers() {
        return maxUsers;
    }
}