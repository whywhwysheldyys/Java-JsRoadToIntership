package second_practice.oop02.encapsulaiton.practiceMain;

import second_practice.oop02.encapsulaiton.practice.Product;

public class ProductMain {
    public static void main(String[] args) {
        Product phone = new Product("Phone", 324.8, 2);

        phone.setPrice(231.0);
        phone.setQuantity(1);

        System.out.println(phone.toString());
    }
}