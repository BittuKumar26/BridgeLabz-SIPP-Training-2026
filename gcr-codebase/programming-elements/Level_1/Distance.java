public class Distance { 
    public static void main(String[] args) { 
        double distanceKm = 100.0; // Distance in kilometers
        
        // Convert distance to miles using conversion factor: 1 km = 0.621371 miles
        double kmToMilesConversion = 0.621371;
        double distanceMiles = distanceKm * kmToMilesConversion;
        
        // Output the result
        System.out.println("The distance of " + distanceKm + " kilometers is equal to " + distanceMiles + " miles.");
    } 
}