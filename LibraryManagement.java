public abstract class LibraryManagement {
    protected String name;
    protected int employeeID;
    protected boolean canIssueBooks;
    protected boolean canDeleteBooks;
    protected boolean canStoreBooks;
    protected boolean canSortBooks;

    public LibraryManagement(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    public abstract boolean canIssueBooks();

    public abstract boolean canDeleteBooks();

    public abstract boolean canStoreBooks();

    public abstract boolean canSortBooks();

    // Method to issue a book
    public void issueBook(Book book, Borrower borrower) {
        // Method body to be implemented in subclasses
    }

    // Method to add a book
    public void addBook(Book book, int quantity) {
        // Method body to be implemented in subclasses
    }

    // Method to delete a book
    public void deleteBook(Book book) {
        // Method body to be implemented in subclasses
    }

    // Method to store books
    public void storeBooks(Book[] books) {
        // Method body to be implemented in subclasses
    }

    // Method to sort books
    public void sortBooks() {
        // Method body to be implemented in subclasses
    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public boolean getCanIssueBooks() {
        return canIssueBooks;
    }

    public void setCanIssueBooks(boolean canIssueBooks) {
        this.canIssueBooks = canIssueBooks;
    }

    public boolean getCanDeleteBooks() {
        return canDeleteBooks;
    }

    public void setCanDeleteBooks(boolean canDeleteBooks) {
        this.canDeleteBooks = canDeleteBooks;
    }

    public boolean getCanStoreBooks() {
        return canStoreBooks;
    }

    public void setCanStoreBooks(boolean canStoreBooks) {
        this.canStoreBooks = canStoreBooks;
    }

    public boolean getCanSortBooks() {
        return canSortBooks;
    }

    public void setCanSortBooks(boolean canSortBooks) {
        this.canSortBooks = canSortBooks;
    }
}
