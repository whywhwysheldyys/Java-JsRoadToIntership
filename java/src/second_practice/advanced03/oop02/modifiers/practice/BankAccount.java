package second_practice.advanced03.oop02.modifiers.practice;

public class BankAccount {
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Введите корректную сумму для пополнения");
        } else {
            balance += amount;
            System.out.println("Ваш баланс пополнен на: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <=0 || amount > balance) {
            System.out.println("Введите корректную сумму для снятия");
        } else {
            balance -= amount;
            System.out.println("Вы сняли сумму: " + amount);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}