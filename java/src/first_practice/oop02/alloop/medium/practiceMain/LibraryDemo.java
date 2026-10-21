package first_practice.oop02.alloop.medium.practiceMain;

import first_practice.oop02.alloop.medium.exceptions.BookAlreadyBorrowedException;
import first_practice.oop02.alloop.medium.practice.Library;
import first_practice.oop02.alloop.medium.practice.LibraryBook;
import first_practice.oop02.alloop.medium.practice.Reader;

import java.util.HashMap;

public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library(new HashMap<>());

        library.addBook(new LibraryBook("978-5-17-091578-8", "Java. Complete Reference", true));
        library.addBook(new LibraryBook("978-0-13-468599-1", "Effective Java", true));

        Reader reader1 = new Reader("R-001", "Alex Ivanov");

        library.borrowBook("978-5-17-091578-8", reader1);
        System.out.println("Книга успешно выдана читателю.");

        try {
            library.borrowBook("978-5-17-091578-8", reader1);
        } catch (BookAlreadyBorrowedException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }

        library.returnBook("978-5-17-091578-8");
        System.out.println("Книга возвращена в библиотеку.");
    }
}