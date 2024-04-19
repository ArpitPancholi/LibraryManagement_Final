class Student implements Borrower,Reader {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void borrowBook(Book book) {
        System.out.println(name + " is borrowing " + book.getTitle());
    }

    @Override
    public void returnBook(Book book) {
        System.out.println(name + " is returning " + book.getTitle());
    }

    @Override
    public void readBook(Book book) {
        System.out.println(name + " is reading " + book.getTitle());
    }
}