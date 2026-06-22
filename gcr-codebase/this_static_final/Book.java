class Book {
    static String libraryName = "Central Library";
    String title, author;
    final String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println(libraryName);
    }

    void display() {
        System.out.println(title + " " + author + " " + isbn);
    }

    public static void main(String[] args) {
        Book b = new Book("Java", "James", "ISBN101");
        if (b instanceof Book) b.display();
        displayLibraryName();
    }
}