import java.util.Scanner;

class BillGenerator {

    // Regular customer (no discount)
    void generateBill(int itemTotal) {
        System.out.println("Customer Type: Regular");
        System.out.println("Final Bill: ₹" + itemTotal);
    }

    // Privileged customer (flat discount)
    void generateBill(int itemTotal, int discount) {
        int finalAmount = itemTotal - discount;

        if (finalAmount < 0) finalAmount = 0;

        System.out.println("Customer Type: Privileged");
        System.out.println("Discount Applied: ₹" + discount);
        System.out.println("Final Bill: ₹" + finalAmount);
    }

    // Festive offer (percentage discount)
    void generateBill(int itemTotal, double discountPercent) {
        double discount = itemTotal * discountPercent / 100;
        double finalAmount = itemTotal - discount;

        System.out.println("Customer Type: Festive Offer");
        System.out.println("Discount Applied: " + discountPercent + "%");
        System.out.println("Final Bill: ₹" + finalAmount);
    }
}

public class MallBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BillGenerator bg = new BillGenerator();

        System.out.print("Enter total amount: ");
        int total = sc.nextInt();

        System.out.println("\nSelect Customer Type:");
        System.out.println("1. Regular");
        System.out.println("2. Privileged");
        System.out.println("3. Festive Offer");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                bg.generateBill(total);
                break;

            case 2:
                System.out.print("Enter flat discount (₹): ");
                int discount = sc.nextInt();
                bg.generateBill(total, discount);
                break;

            case 3:
                System.out.print("Enter discount percentage: ");
                double percent = sc.nextDouble();
                bg.generateBill(total, percent);
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
