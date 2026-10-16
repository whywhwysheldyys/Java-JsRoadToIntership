package alloop.easy.practiceMain;

import alloop.easy.practice.Book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Three Musketers", "Duma", 345);

        book.setPages(0);
        book.setPages(320);
        book.printBookInfo();
    }
}