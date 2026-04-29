class BankAccount {
    String accountHolderName;
    double balance;

    // Static variable (common for all accounts)
    static double interestRate = 5.0; // default 5%

    // Constructor
    BankAccount(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }

    // Method to calculate interest
    double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Earned: ₹" + calculateInterest());
        System.out.println();
    }

    // Static method to update interest rate
    static void updateInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("Interest rate updated to " + interestRate + "%\n");
    }
}

// Main class
public class BankDemo {
    public static void main(String[] args) {

        // Create accounts
        BankAccount acc1 = new BankAccount("Amit", 10000);
        BankAccount acc2 = new BankAccount("Riya", 20000);

        // Display initial details
        System.out.println("Before updating interest rate:");
        acc1.displayDetails();
        acc2.displayDetails();

        // Update interest rate using static method
        BankAccount.updateInterestRate(7.5);

        // Display updated details
        System.out.println("After updating interest rate:");
        acc1.displayDetails();
        acc2.displayDetails();
    }
}
