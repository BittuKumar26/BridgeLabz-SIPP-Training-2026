class BookConstructor {
    String title;
    String author;
    double price;

    BookConstructor() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    BookConstructor(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println(title + " " + author + " " + price);
    }

    public static void main(String[] args) {
        BookConstructor b1 = new BookConstructor();
        BookConstructor b2 = new BookConstructor("Java", "James Gosling", 500);
        b1.display();
        b2.display();
    }
}