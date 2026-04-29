class Point {
    int x, y;

    // Default constructor
    Point() {
        x = 5;
        y = 5;
    }

    // Parameterized constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    // Display method
    void display() {
        System.out.println("Point (" + x + ", " + y + ")");
    }
}

// Main class
public class PointDemo {
    public static void main(String[] args) {

        // Default constructor
        Point p1 = new Point();

        // Parameterized constructor
        Point p2 = new Point(10, 20);

        // Copy constructor
        Point p3 = new Point(p2);

        // Display points
        System.out.println("Using Default Constructor:");
        p1.display();

        System.out.println("Using Parameterized Constructor:");
        p2.display();

        System.out.println("Using Copy Constructor:");
        p3.display();
    }
}
