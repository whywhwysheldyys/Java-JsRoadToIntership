package second_practice.advanced03.oop02.encapsulation.practiceMain;

import second_practice.advanced03.oop02.encapsulation.practice.SimpleWallet;

public class WalletMain {
    public static void main(String[] args) {
        SimpleWallet walletFirst = new SimpleWallet(-100);
        SimpleWallet walletSecond = new SimpleWallet(0);

        System.out.println(walletFirst.getBalance());

        walletSecond.deposit(200);
        System.out.println(walletSecond.getBalance());
    }
}