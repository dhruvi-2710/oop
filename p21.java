import java.util.Scanner;

public class MeterToFeet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();

        // Conversion (1 meter = 3.28084 feet)
        double feet = meters * 3.28084;

        // Display result with 2 decimal places
        System.out.printf("Distance in feet: %.2f", feet);

        sc.close();
    }
}
