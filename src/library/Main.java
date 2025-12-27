package library;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Author author = new Author("Robert Martin");
        Book book = new Book("ISBN001", "Clean Code", author);
        library.addBook(book);

        Reader reader = new Reader("R01", "Nam");
        library.addReader(reader);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Show books");
            System.out.println("2. Borrow book");
            System.out.println("3. Return book");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                library.showBooks();
            } else if (choice == 2) {
                library.borrowBook(reader, book);
            } else if (choice == 3) {
                library.returnBook(book);
            } else {
                break;
            }
        }
    }
}

