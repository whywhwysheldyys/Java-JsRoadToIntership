package second_practice.advanced03.oop02.constructors.practiceMain;

import second_practice.advanced03.oop02.constructors.practice.Book;

public class BookMain {
    public static void main(String[] args) {
        Book originalBook = new Book("Dead Souls", "Gogol", 324);
        Book copyBook = new Book(originalBook);
        copyBook.setTitle("Three Muskeeters");

        originalBook.displayInfo();
        copyBook.displayInfo();
    }
}