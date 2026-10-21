package first_practice.oop02.alloop.medium.practice;

import first_practice.oop02.alloop.medium.exceptions.BookAlreadyBorrowedException;

import java.util.Map;

public class Library {
    private Map<String, LibraryBook> books;

    public Library(Map<String, LibraryBook> books) {
        this.books = books;
    }

    public void addBook(LibraryBook book) {
        books.put(book.getIsbn(), book);
    }

    public void borrowBook(String isbn, Reader reader) {
        LibraryBook book = books.get(isbn);

        if (book == null || !book.isAvailable()) {
            throw new BookAlreadyBorrowedException("Книга с ISBN " + isbn + " уже выдана или не найдена!");
        }

        book.setAvailable(false);
    }

    public void returnBook(String isbn) {
        LibraryBook book = books.get(isbn);

        if (book != null) {
            book.setAvailable(true);
        }
    }
}