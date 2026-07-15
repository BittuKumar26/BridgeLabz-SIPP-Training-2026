class Product {
    static double discount = 10;

    String productName;
    double price;
    int quantity;
    final int productID;

    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double d) {
        discount = d;
    }

    void display() {
        System.out.println(productName + " " + productID);
    }

    public static void main(String[] args) {
        Product p = new Product("Laptop", 50000, 2, 101);
        if (p instanceof Product) p.display();
    }
}