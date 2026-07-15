import java.util.Scanner;

public class IntOperation {
    
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for integers a, b, and c
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
        
        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();
        
        // Compute integer operations with operator precedence
        // a + b * c (multiplication has higher precedence than addition)
        int operation1 = a + b * c;
        
        // a * b + c (multiplication has higher precedence than addition)
        int operation2 = a * b + c;
        
        // c + a / b (division has higher precedence than addition)
        int operation3 = c + a / b;
        
        // a % b + c (modulus has higher precedence than addition)
        int operation4 = a % b + c;
        
        // Output the results
        System.out.println("The results of Int Operations are " + operation1 + ", " + operation2 + ", " + operation3 + ", and " + operation4);
         
    }
}
