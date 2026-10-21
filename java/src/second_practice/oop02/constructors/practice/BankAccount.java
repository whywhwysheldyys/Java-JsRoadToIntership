package second_practice.oop02.constructors.practice;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner) {
        this.owner = owner;
    }

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Ошибка!Введите верную сумму");
        } else {
            balance += amount;
            System.out.println("Баланс пополнен на: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Ошибка!Введите верную сумму");
        } else {
            balance -= amount;
            System.out.println("С баланса снято: " + amount);
        }
    }

    public double printBalance() {
        return balance;
    }
}