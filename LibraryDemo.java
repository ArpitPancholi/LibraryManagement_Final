import java.util.Scanner;

public class LibraryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Library Management System");
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        Administrator admin = new Administrator(username, password);

        System.out.println("Administrator logged in: " + admin.getUsername());

        // Demonstrate various functionalities
        demonstrateFunctionality(scanner);
    }

    private static void demonstrateFunctionality(Scanner scanner) {
        // Simulate adding multiple books
        Book book1 = new Book("Introduction to Java", "John Doe", 2022, 1234567890);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Smith", 2021, 987654321);
        LibraryManagement librarian = new Librarian("Librarian", 123456, 100, 1000, 100, 100, 100);
        librarian.addBook(book1, 3); // Add 3 copies of book1
        librarian.addBook(book2, 2); // Add 2 copies of book2
        System.out.println("Books added to library.");

        // Simulate advanced searching
        System.out.print("Enter author name to search: ");
        String authorToSearch = scanner.nextLine();
        // Perform search using SearchEngine
        Book[] foundBooks = SearchEngine.searchByAuthor(authorToSearch, librarian.getLibraryInventory());
        if (foundBooks.length > 0) {
            System.out.println("Books found by " + authorToSearch + ":");
            for (Book book : foundBooks) {
                System.out.println("- " + book.getTitle());
            }
        } else {
            System.out.println("No books found by " + authorToSearch);
        }

        // Simulate issuing a book
        Borrower borrower = new Student("Alice");
        librarian.issueBook(book1, borrower);
        System.out.println("Book issued to " + borrower.getName());

        // Simulate returning a book
        librarian.returnBook(book1, borrower);
        System.out.println("Book returned by " + borrower.getName());

        // Display library statistics
        System.out.println("Library Statistics:");
        System.out.println("Total books: " + librarian.getTotalBooks());
        System.out.println("Total magazines: " + librarian.getTotalMagazines());
        System.out.println("Total journals: " + librarian.getTotalJournals());
        System.out.println("Total theses: " + librarian.getTotalTheses());
        System.out.println("Total issued books: " + librarian.getIssuedBooksCount());
    }
}
