// Base class
class Shape {
    double d1, d2;

    // Method to initialize data
    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

// Derived class: Triangle
class Triangle extends Shape {

    double getArea() {
        return 0.5 * d1 * d2;
    }
}

// Derived class: Rectangle
class Rectangle extends Shape {

    double getArea() {
        return d1 * d2;
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {

        // Triangle object
        Triangle t = new Triangle();
        t.getData(10, 5);
        System.out.println("Area of Triangle: " + t.getArea());

        // Rectangle object
        Rectangle r = new Rectangle();
        r.getData(10, 5);
        System.out.println("Area of Rectangle: " + r.getArea());
    }
}
