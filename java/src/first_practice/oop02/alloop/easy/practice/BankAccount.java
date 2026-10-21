package first_practice.oop02.alloop.easy.practice;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else  {
            System.out.println("Введите корректную сумму");
        }
        return balance;
    }

    public double withdraw(double amount) {
        if (amount < 0 || amount > balance) {
            System.out.println("Введите корректную сумму");
        } else {
            balance -= amount;
        }

        return balance;
    }
}