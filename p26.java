class Rectangle {
    double width = 1;
    double height = 1;

    // No-argument constructor
    Rectangle() {
        // default values already set
    }

    // Parameterized constructor
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area
    double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    double getPerimeter() {
        return 2 * (width + height);
    }
}

// Main class to test
public class RectangleDemo {
    public static void main(String[] args) {

        // Using default constructor
        Rectangle r1 = new Rectangle();

        // Using parameterized constructor
        Rectangle r2 = new Rectangle(5, 3);

        System.out.println("Rectangle 1:");
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());

        System.out.println("\nRectangle 2:");
        System.out.println("Area = " + r2.getArea());
        System.out.println("Perimeter = " + r2.getPerimeter());
    }
}
