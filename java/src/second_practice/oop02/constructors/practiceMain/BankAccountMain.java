package second_practice.oop02.constructors.practiceMain;

import second_practice.oop02.constructors.practice.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Andrey", 568.0);

        bankAccount.deposit(34);
        bankAccount.withdraw(316);

        System.out.println(bankAccount.printBalance());
    }
}