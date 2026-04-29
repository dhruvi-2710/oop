import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        // Check if valid triangle
        if (a + b > c && a + c > b && b + c > a) {

            // Calculate semi-perimeter
            double s = (a + b + c) / 2;

            // Heron's formula
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.printf("Area of triangle: %.2f", area);

        } else {
            System.out.println("Invalid triangle. The given sides do not form a triangle.");
        }

        sc.close();
    }
}
