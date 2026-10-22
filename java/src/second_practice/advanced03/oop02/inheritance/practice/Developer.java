package second_practice.advanced03.oop02.inheritance.practice;

public class Developer extends Employee{
    private String mainLanguage;

    public Developer(String name, double baseSalary, String mainLanguage) {
        super(name, baseSalary);
        this.mainLanguage = mainLanguage;
    }

    @Override
    public double calculateSalary() {
        if (mainLanguage.equals("Java")) {
            return getBaseSalary() * 1.3;
        } else {
            return getBaseSalary();
        }
    }
}