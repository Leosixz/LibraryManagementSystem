package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Reader> readers = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addReader(Reader reader) {
        readers.add(reader);
    }

    public Book findBookByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public void borrowBook(Reader reader, Book book) {
        if (book != null && book.isAvailable()) {
            book.borrow();
            loans.add(new Loan(reader, book, 7));
            System.out.println("Borrow successful");
        } else {
            System.out.println("Book not available");
        }
    }

    public void returnBook(Book book) {
        for (Loan loan : loans) {
            if (loan.getBook() == book) {
                loan.returnBook();
                System.out.println("Return successful");
                return;
            }
        }
        System.out.println("Loan not found");
    }

    public void showBooks() {
        for (Book b : books) {
            System.out.println(b.getInfo());
        }
    }
}

