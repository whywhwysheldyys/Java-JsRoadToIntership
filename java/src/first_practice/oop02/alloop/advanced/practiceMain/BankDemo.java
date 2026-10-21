package first_practice.oop02.alloop.advanced.practiceMain;

import first_practice.oop02.alloop.advanced.practice.BankAccount;
import first_practice.oop02.alloop.advanced.practice.BankTransaction;

public class BankDemo {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount("ACC-12345", 1000.0);

        System.out.println("Начальный баланс: " + account.getBalance());

        BankTransaction depositTask1 = new BankTransaction(account, 500.0, true);
        BankTransaction withdrawTask1 = new BankTransaction(account, 300.0, false);
        BankTransaction depositTask2 = new BankTransaction(account, 200.0, true);
        BankTransaction withdrawTask2 = new BankTransaction(account, 1500.0, false);

        Thread t1 = new Thread(depositTask1, "Thread-1");
        Thread t2 = new Thread(withdrawTask1, "Thread-2");
        Thread t3 = new Thread(depositTask2, "Thread-3");
        Thread t4 = new Thread(withdrawTask2, "Thread-4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("Итоговый баланс счета: " + account.getBalance());
    }
}