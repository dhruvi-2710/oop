import java.util.Scanner;

public class PasswordValidator {

    // Method to check password validity
    static boolean isValidPassword(String password) {

        // Rule 1: At least 8 characters
        if (password.length() < 8) {
            return false;
        }

        int digitCount = 0;

        // Check each character
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            // Rule 2: Only letters and digits
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            // Count digits
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        // Rule 3: At least 2 digits
        return digitCount >= 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

        sc.close();
    }
}
