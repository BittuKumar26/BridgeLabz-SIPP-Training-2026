class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 0;
    }

    void addItem(int qty) {
        quantity += qty;
    }

    void removeItem(int qty) {
        if (qty <= quantity)
            quantity -= qty;
        else
            System.out.println("Not enough items to remove");
    }

    void displayTotalCost() {
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem item = new CartItem("Laptop", 50000);
        item.addItem(2);
        item.removeItem(1);
        item.displayTotalCost();
    }
}