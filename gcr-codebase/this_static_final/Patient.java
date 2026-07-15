class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    String name, ailment;
    int age;
    final int patientID;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Patients: " + totalPatients);
    }

    void display() {
        System.out.println(name + " " + patientID + " " + ailment);
    }

    public static void main(String[] args) {
        Patient p = new Patient("Bittu", 20, "Fever", 1001);
        if (p instanceof Patient) p.display();
        getTotalPatients();
    }
}