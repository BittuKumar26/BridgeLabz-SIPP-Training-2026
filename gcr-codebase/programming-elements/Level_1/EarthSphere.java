public class EarthSphere {
    public static void main(String[] args) {
        double radius = 6378.0; // Radius of the Earth in kilometers
        
        // Calculate volume in cubic kilometers using formula: (4/3) * pi * r^3
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        
        // Convert cubic kilometers to cubic miles
        // 1 km = 0.621371 miles, so 1 km^3 = (0.621371)^3 cubic miles
        double kmToMilesConversion = 0.621371;
        double volumeMiles3 = volumeKm3 * Math.pow(kmToMilesConversion, 3);
        
        // Output the result
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}
