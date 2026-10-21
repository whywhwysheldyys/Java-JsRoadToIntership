package second_practice.oop02.modifiers.practice;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Ошибка!Введите корректную сумму");
        } else {
            balance += amount;
        }
    }

    protected void logTransaction(String type, double amount) {
        System.out.println("Тип операции: " + type + "\n" + "Сумма: " + amount);
    }

    boolean checkBalance(double amount) {
        if (amount >= balance) {
            return false;
        } else {
            return true;
        }
    }
}