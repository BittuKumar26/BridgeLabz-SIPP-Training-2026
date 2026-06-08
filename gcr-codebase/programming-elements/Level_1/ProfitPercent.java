public class ProfitPercent {
    public static void main(String[] args) {
        double costPrice = 150.0; // Example cost price
        double sellingPrice = 200.0; // Example selling price
        
        double profit = sellingPrice - costPrice; // Calculate profit
        double profitPercent = (profit / costPrice) * 100; // Calculate profit percentage
        
        System.out.println("Profit Percentage: " + profitPercent + "%");
    }
}
