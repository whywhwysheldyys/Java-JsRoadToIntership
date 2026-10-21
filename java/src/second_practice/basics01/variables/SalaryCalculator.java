package second_practice.basics01.variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        String workerName = "Алексей";
        int hoursWorked = 160;
        double hourlyRate = 25.5;
        double salaryBonusPercent = 15.0;
        double workerFeePercent = 13.0;

        double baseSalary = hoursWorked * hourlyRate;
        double bonusAmount = baseSalary * (salaryBonusPercent / 100.0);
        double grossSalary = baseSalary + bonusAmount;
        double taxAmount = grossSalary * (workerFeePercent / 100.0);
        double netSalary = grossSalary - taxAmount;


        //не лучший вариант записи
        //double salary = ((hoursWorked * hourlyRate) + salaryBonus) * ((100 - workerFee) / 100);

        System.out.println("Сотрудник: " + workerName + "\n"
                            + "Отработано часов: " + hoursWorked + "\n"
                            + "Почасовая ставка: "  + hourlyRate + "\n"
                            + "Премия: "  + salaryBonusPercent + "% (" + bonusAmount + ")\n"
                            + "Подоходный налог: " + workerFeePercent + "% (" + taxAmount + ")\n"
                            + "Итоговая зарплата составляет: " + netSalary);
    }
}