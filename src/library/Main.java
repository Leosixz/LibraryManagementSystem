
package library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        // Dữ liệu mẫu
        Author author = new Author("Robert Martin");
        library.addBook(new Book("ISBN001", "Clean Code", author));
        library.addBook(new Book("ISBN002", "Clean Architecture", author));

        Reader reader = new Reader("R01", "Nam");
        library.addReader(reader);

        int choice;
        do {
            System.out.println("\n=== LIBRARY MANAGEMENT SYSTEM ===");
            System.out.println("1. Show all books");
            System.out.println("2. Find book by title");
            System.out.println("3. Borrow book");
            System.out.println("4. Return book");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    library.showBooks();
                    break;

                case 2:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    Book found = library.findBookByTitle(title);
                    if (found != null) {
                        System.out.println(found.getInfo());
                    } else {
                        System.out.println("Book not found");
                    }
                    break;

                case 3:
                    System.out.print("Enter title to borrow: ");
                    title = sc.nextLine();
                    Book borrowBook = library.findBookByTitle(title);
                    library.borrowBook(reader, borrowBook);
                    break;

                case 4:
                    System.out.print("Enter title to return: ");
                    title = sc.nextLine();
                    Book returnBook = library.findBookByTitle(title);
                    library.returnBook(returnBook);
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);

        sc.close();
    }
}
