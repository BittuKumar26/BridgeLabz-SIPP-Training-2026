import java.util.Scanner;

public class TriangleArea {
    
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for base and height in centimeters
        System.out.print("Enter the base of the triangle (in cm): ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter the height of the triangle (in cm): ");
        double height = scanner.nextDouble();
        
        // Calculate area of triangle in square centimeters
        // Area = 0.5 * base * height
        double areaCm2 = 0.5 * base * height;
        
        // Convert area from square centimeters to square inches
        // 1 inch = 2.54 cm, so 1 sq inch = (2.54)^2 sq cm = 6.4516 sq cm
        double cmToInchesConversion = 1 / 6.4516;
        double areaIn2 = areaCm2 * cmToInchesConversion;
        
        // Output the results
        System.out.println("The Area of the triangle in sq in is " + areaIn2 + " and sq cm is " + areaCm2);
         
    }
}
