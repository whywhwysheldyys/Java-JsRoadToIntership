package second_practice.advanced03.oop02.constructors.practice;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book() {
        this.title = "Unknown";
        this.author = "Anonymous";
        this.pages = 0;
    };

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.pages = other.pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void displayInfo() {
        System.out.println("Название книги: " + title + "\n"
                            + "Автор книги: " + author + "\n"
                            + "Количество страниц: " + pages);
    }
}