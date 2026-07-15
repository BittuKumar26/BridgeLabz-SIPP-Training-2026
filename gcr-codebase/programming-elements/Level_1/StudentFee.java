import java.util.Scanner;

public class StudentFee {
    
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for fee
        System.out.print("Enter the student fee (in INR): ");
        double fee = scanner.nextDouble();
        
        // Take user input for discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercent = scanner.nextDouble();
        
        // Compute the discount amount
        double discount = (fee * discountPercent) / 100;
        
        // Compute the final fee after discount
        double finalFee = fee - discount;
        
        // Output the result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
         
    }
}
