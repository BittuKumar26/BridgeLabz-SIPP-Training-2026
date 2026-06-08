import java.util.Scanner;

public class HeightFeet {
    
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = scanner.nextDouble();
        
        // Convert centimeters to inches (1 inch = 2.54 cm)
        double heightInches = heightCm / 2.54;
        
        // Convert inches to feet and remaining inches (1 foot = 12 inches)
        int feet = (int) heightInches / 12;
        double inches = heightInches % 12;
        
        // Output the result
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
        
    }
}
