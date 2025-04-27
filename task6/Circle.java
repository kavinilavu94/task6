package task6;
class Circle {
    private double radius;

    // No-argument constructor
    public Circle() {
        radius = 0;
    }

    // Constructor with one argument
    public Circle(double r) {
        radius = r;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Main method to test the s
    public static void main(String[] args) {
        Circle circle1 = new Circle();       // Using no-argument constructor
        Circle circle2 = new Circle(5.0);     // Using constructor with argument

        System.out.println("Circumference of circle1: " + circle1.calculateCircumference());
        System.out.println("Circumference of circle2: " + circle2.calculateCircumference());
    }
}
