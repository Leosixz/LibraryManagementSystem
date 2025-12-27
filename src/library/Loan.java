package library;

import java.time.LocalDate;

public class Loan {
    private Reader reader;
    private Book book;
    private LocalDate borrowDate;
    private LocalDate dueDate;
    private LocalDate returnDate;

    public Loan(Reader reader, Book book, int days) {
        this.reader = reader;
        this.book = book;
        this.borrowDate = LocalDate.now();
        this.dueDate = borrowDate.plusDays(days);
    }

    public void returnBook() {
        returnDate = LocalDate.now();
        book.returned();
    }

    public boolean isOverdue() {
        if (returnDate != null) return false;
        return LocalDate.now().isAfter(dueDate);
    }

    public Book getBook() {
        return book;
    }
}

