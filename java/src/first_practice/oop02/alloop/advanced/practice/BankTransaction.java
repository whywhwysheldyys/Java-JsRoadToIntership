package first_practice.oop02.alloop.advanced.practice;

public class BankTransaction implements Runnable{
    private BankAccount account;
    private double amount;
    private boolean isDeposit;

    public BankTransaction(BankAccount account, double amount, boolean isDeposit) {
        this.account = account;
        this.amount = amount;
        this.isDeposit = isDeposit;
    }

    @Override
    public void run() {
        if (isDeposit) {
            account.deposit(amount);
            System.out.println(Thread.currentThread().getName() + "пополнил счет на: " + amount);
        } else {
            try {
                account.withdraw(amount);
                System.out.println(Thread.currentThread().getName() + " снял со счета: " + amount);
            } catch (Exception exception) {
                System.out.println(Thread.currentThread().getName() + " не смог снять деньги: " + exception.getMessage());
            }
        }
    }
}