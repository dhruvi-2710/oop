import java.util.Scanner;

// Interface
interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

// Abstract class (partial implementation)
abstract class PartialOrder implements Order {
    protected String item;
    protected int quantity;
    protected int orderId;

    // Implement only placeOrder()
    public void placeOrder(String item, int qty) {
        this.item = item;
        this.quantity = qty;
        this.orderId = (int)(Math.random() * 1000); // simple random ID

        System.out.println("Order placed successfully!");
        System.out.println("Order ID: " + orderId);
    }
}

// Concrete class
class FinalOrder extends PartialOrder {

    // Implement cancelOrder()
    public void cancelOrder(int orderId) {
        if (this.orderId == orderId) {
            System.out.println("Order " + orderId + " has been cancelled.");
            this.item = null;
            this.quantity = 0;
        } else {
            System.out.println("Invalid Order ID.");
        }
    }

    // Implement generateBill()
    public void generateBill() {
        if (item == null || quantity == 0) {
            System.out.println("No active order to generate bill.");
            return;
        }

        int pricePerItem = 100; // fixed price
        int total = quantity * pricePerItem;

        System.out.println("\n--- BILL ---");
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: ₹" + pricePerItem);
        System.out.println("Total Amount: ₹" + total);
    }
}

// Main class
public class OrderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FinalOrder order = new FinalOrder();

        // Take order input
        System.out.print("Enter item name: ");
        String item = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        order.placeOrder(item, qty);

        // User choice
        System.out.println("\n1. Generate Bill");
        System.out.println("2. Cancel Order");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                order.generateBill();
                break;

            case 2:
                System.out.print("Enter Order ID to cancel: ");
                int id = sc.nextInt();
                order.cancelOrder(id);
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
