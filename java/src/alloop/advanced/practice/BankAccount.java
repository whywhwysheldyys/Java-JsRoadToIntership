package alloop.advanced.practice;

import alloop.advanced.exceptions.InsufficientFundsException;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized void withdraw(double amount) {
        if (balance < amount) {
            throw new InsufficientFundsException("Недостаточно средств!");
        }
        balance -= amount;
    }

    public synchronized double getBalance() {
        return balance;
    }
}