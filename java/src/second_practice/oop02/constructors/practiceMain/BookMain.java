package second_practice.oop02.constructors.practiceMain;

import second_practice.oop02.constructors.practice.Book;

public class BookMain {
    public static void main(String[] args) {
        Book bookFirst = new Book("Three Musketers", "Duma");
        Book bookSecond = new Book("Dead souls", "Gogol", 345);
        Book bookThird = new Book("Alphabet", "Bukvaeshka", 300, 12.2);

        bookFirst.displayInfo();
        bookSecond.displayInfo();
        bookThird.displayInfo();
    }
}