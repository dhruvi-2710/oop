import java.util.Scanner;

public class AddOneToDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();

        int result = 0;
        int place = 1;
        int carry = 0;

        while (num > 0) {
            int digit = num % 10;

            int sum = digit + 1 + carry;

            if (sum == 10) {
                sum = 0;
                carry = 1;
            } else {
                carry = 0;
            }

            result = result + (sum * place);
            place = place * 10;

            num = num / 10;
        }

        // If carry remains (like 99999 case)
        if (carry == 1) {
            result = result + (carry * place);
        }

        System.out.println("New number: " + result);

        sc.close();
    }
}
