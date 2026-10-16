package alloop.easy.practiceMain;

import alloop.easy.practice.BankAccount;

public class BankMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("12355242", 120.0);

        System.out.println(bankAccount.deposit(200));
        System.out.println(bankAccount.withdraw(300));
    }
}