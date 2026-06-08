import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for two numbers
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        
        // Perform basic arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
        
        // Output the results
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
         
    }
}
