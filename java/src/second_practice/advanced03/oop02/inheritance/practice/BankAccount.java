package second_practice.advanced03.oop02.inheritance.practice;

public class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        setBalance(balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Введите корректное значение баланса");
        }  else {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Введите корректную сумму для пополнения");
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Введите корректную сумму для снятия");
        } else {
            balance -= amount;
        }
    }
}