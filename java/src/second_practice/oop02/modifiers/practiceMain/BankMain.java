package second_practice.oop02.modifiers.practiceMain;

import second_practice.oop02.modifiers.practice.Account;

public class BankMain {
    public static void main(String[] args) {
        Account account = new Account(345.0);

        //System.out.println(account.checkBalance(1000.0)); //для работы переместить в practice пакет
        account.deposit(324.0);
        //account.logTransaction("Онлайн", 324.0);

        //все методы работают потому что main находится в пакете с account

    }
}