class Student {
    static String universityName = "GLA University";
    static int totalStudents = 0;

    String name, grade;
    final int rollNumber;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Students: " + totalStudents);
    }

    void display() {
        System.out.println(name + " " + rollNumber + " " + grade);
    }

    public static void main(String[] args) {
        Student s = new Student("Bittu", 101, "A");
        if (s instanceof Student) s.display();
        displayTotalStudents();
    }
}