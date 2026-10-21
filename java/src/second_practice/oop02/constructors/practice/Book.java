package second_practice.oop02.constructors.practice;

public class Book {
    private String title;
    private String author;
    private int pages;
    private double price;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0;
        this.price = 0;
    }

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = 0.0;
    }

    public Book(String title, String author, int pages, double price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Название книги: " + title + "\n"
                             + "Автор книги: " + author + "\n"
                             + "Количество страниц: " + pages + "\n"
                             + "Цена книги: " + price + "\n");
    }
}