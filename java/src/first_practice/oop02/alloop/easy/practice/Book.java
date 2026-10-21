package first_practice.oop02.alloop.easy.practice;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages <= 0) {
            throw new IllegalArgumentException("Некорректное количество страниц!");
        } else {
            this.pages = pages;
        }
    }
     public void printBookInfo() {
         System.out.println("Название: " + title + "\n"
                            + "Автор: " + author + "\n"
                            + "Количество страниц: " + pages);
     }
}