package second_practice.advanced03.oop02.encapsulation.practice;

public class SimpleWallet {
    private double balance;

    public SimpleWallet(double balance) {
        setBalance(balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Ошибка!Введите корректное значение для баланса");
        } else {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Ошибка введите корректную сумму для пополнения");
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Введите корректную сумму для снятия со счета!");
        } else {
            balance -= amount;
        }
    }
}