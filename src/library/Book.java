package library;

public class Book {
    private String isbn;
    private String title;
    private Author author;
    private boolean available;

    public Book(String isbn, String title, Author author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrow() {
        available = false;
    }

    public void returned() {
        available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return isbn + " | " + title + " | " + author.getName() +
               " | " + (available ? "Available" : "Borrowed");
    }
}

