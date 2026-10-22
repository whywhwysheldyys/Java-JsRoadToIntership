package second_practice.advanced03.oop02.inheritance.practiceMain;

import second_practice.advanced03.oop02.inheritance.practice.BankAccount;
import second_practice.advanced03.oop02.inheritance.practice.CreditAccount;

public class BankMain {
    public static void main(String[] args) {
        BankAccount defaultAccount = new BankAccount(324.12);
        System.out.println(defaultAccount.getBalance());

        CreditAccount creditAccount = new CreditAccount(320.0, 300);
        creditAccount.withdraw(500);
        System.out.println(creditAccount.getBalance());

        creditAccount.withdraw(300);
        System.out.println(creditAccount.getBalance());
    }
}