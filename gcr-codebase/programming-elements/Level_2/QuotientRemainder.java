import java.util.Scanner;

public class QuotientRemainder {
    
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for first number
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        
        // Take user input for second number
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        
        // Calculate quotient using division operator (/)
        int quotient = number1 / number2;
        
        // Calculate remainder using moduli operator (%)
        int remainder = number1 % number2;
        
        // Output the results
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two number " + number1 + " and " + number2);
         
    }
}
