import java.util.Scanner;

public class SquareSide {
    
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();
        
        // Calculate the side of the square
        // Perimeter = 4 * side, so side = perimeter / 4
        double side = perimeter / 4;
        
        // Output the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    } 
}
