class ChargingStation {
    static int totalStations = 0;
    static double electricityRate = 8.5;

    String stationId;
    double unitsConsumed;

    ChargingStation(String stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    void displayStationDetails() {
        System.out.println(stationId + " Bill: " + calculateBill());
    }

    public static void main(String[] args) {
        ChargingStation[] s = {
            new ChargingStation("S1",100),
            new ChargingStation("S2",120),
            new ChargingStation("S3",150),
            new ChargingStation("S4",80),
            new ChargingStation("S5",90)
        };

        for(ChargingStation cs : s)
            cs.displayStationDetails();

        System.out.println("Total Stations: " + totalStations);
    }
}