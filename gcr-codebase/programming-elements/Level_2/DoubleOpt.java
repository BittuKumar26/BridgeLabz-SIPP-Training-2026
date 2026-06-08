import java.util.Scanner;

public class DoubleOpt {
    
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for double values a, b, and c
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();
        
        // Compute double operations with operator precedence
        // a + b * c (multiplication has higher precedence than addition)
        double operation1 = a + b * c;
        
        // a * b + c (multiplication has higher precedence than addition)
        double operation2 = a * b + c;
        
        // c + a / b (division has higher precedence than addition)
        double operation3 = c + a / b;
        
        // a % b + c (modulus has higher precedence than addition)
        double operation4 = a % b + c;
        
        // Output the results
        System.out.println("The results of Double Operations are " + operation1 + ", " + operation2 + ", " + operation3 + ", and " + operation4);
         
    }
}
