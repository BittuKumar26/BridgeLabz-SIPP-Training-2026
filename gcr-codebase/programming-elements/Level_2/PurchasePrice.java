import java.util.Scanner;

public class PurchasePrice {
    
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for unit price
        System.out.print("Enter the unit price (in INR): ");
        double unitPrice = scanner.nextDouble();
        
        // Take user input for quantity
        System.out.print("Enter the quantity to be bought: ");
        double quantity = scanner.nextDouble();
        
        // Calculate total price
        double totalPrice = unitPrice * quantity;
        
        // Output the result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity and unit price is INR " + unitPrice);
         
    }
}
