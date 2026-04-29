import java.util.Scanner;

public class LinearEquations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coefficients a, b, c, d, e, f:");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        // Cramer's Rule calculations
        double D = a * d - b * c;
        double Dx = e * d - b * f;
        double Dy = a * f - e * c;

        // Check denominator
        if (D == 0) {
            System.out.println("The system has no unique solution (D = 0).");
        } else {
            double x = Dx / D;
            double y = Dy / D;

            System.out.println("Solution:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

        sc.close();
    }
}
