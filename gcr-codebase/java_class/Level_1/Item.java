class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    double totalCost(int quantity) {
        return price * quantity;
    }

    void display(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Total Cost: " + totalCost(quantity));
    }

    public static void main(String[] args) {
        Item item = new Item(1, "Pen", 20);
        item.display(5);
    }
}