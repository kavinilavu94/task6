package task6;
class Employee {
    // Attributes
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to raise salary by a given percentage
    public void raiseSalary(double percent) {
        if (percent > 0) {
            salary += salary * (percent / 100);
            System.out.println("Salary raised by " + percent + "%.");
        } else {
            System.out.println("Invalid percentage. Must be positive.");
        }
    }

    // Method to display employee details
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Alice", 50000);

        System.out.println("Before Raise:");
        emp1.displayInfo();

        emp1.raiseSalary(10);  // Raising salary by 10%

        System.out.println("\nAfter Raise:");
        emp1.displayInfo();
    }
}

