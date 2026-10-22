package second_practice.advanced03.oop02.inheritance.practice;

public class CreditAccount extends BankAccount{
    private double creditLimit;

    public CreditAccount(double balance, double creditLimit) {
        super(balance);
        this.creditLimit = -creditLimit;
    }

    @Override
    public void withdraw(double amount) {
        if ( (balance - amount) < creditLimit) {
            System.out.println("Вы вышли за рамки овердрафта");
        } else {
            balance -= amount;
        }
    }
}