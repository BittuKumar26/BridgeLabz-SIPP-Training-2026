public class UniversityDiscount {
    public static void main(String[] args) {
        double originalPrice = 125000.0; // Example original price
        double discountPercent = 10.0; // Example discount percentage
        
        double discountAmount = (discountPercent / 100) * originalPrice; // Calculate discount amount
        double discountedPrice = originalPrice - discountAmount; // Calculate discounted price
        
        System.out.println("Original Price: $" + originalPrice);
        System.out.println("Discount Percentage: " + discountPercent + "%");
        System.out.println("Discount Amount: $" + discountAmount);
        System.out.println("Discounted Price: $" + discountedPrice);
    }
}
