package second_practice.oop02.modifiers.practice;

public class Person {
    public String publicName;
    protected int protectedAge;
    String defaultEmail;
    private String passportNumber;

    public Person(String publicName, int protectedAge, String defaultEmail, String passportNumber) {
        this.publicName = publicName;
        this.protectedAge = protectedAge;
        this.defaultEmail = defaultEmail;
        this.passportNumber = passportNumber;
    }

    public String getPublicName() {
        return publicName;
    }

    public void setPublicName(String publicName) {
        this.publicName = publicName;
    }

    public int getProtectedAge() {
        return protectedAge;
    }

    public void setProtectedAge(int protectedAge) {
        this.protectedAge = protectedAge;
    }

    public String getDefaultEmail() {
        return defaultEmail;
    }

    public void setDefaultEmail(String defaultEmail) {
        this.defaultEmail = defaultEmail;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "Имя пользователя: " + publicName
                + ", возраст: " + protectedAge
                + ", почта: " + defaultEmail
                + ", номер паспорта: " + passportNumber;
    }
}