class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental() {
        customerName = "Guest";
        carModel = "Swift";
        rentalDays = 1;
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * 1500;
    }

    void display() {
        System.out.println(customerName + " " + carModel);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental c = new CarRental("Bittu", "Creta", 5);
        c.display();
    }
}