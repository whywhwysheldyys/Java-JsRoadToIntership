package constructors.practiceMain;

import constructors.practice.BankAccount;

public class BankMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("123123213", "Andrey", 345.5);

        bankAccount.deposit(644.5);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(300.0);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(1100);
        System.out.println(bankAccount.getBalance());
    }
}