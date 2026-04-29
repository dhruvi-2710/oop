// Custom Exception
class NotSufficientFundException extends Exception {
    public NotSufficientFundException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {
    private double balance;

    // Constructor
    BankAccount() {
        balance = 1000.00;
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount + " | Balance: ₹" + balance);
    }

    // Withdraw method
    void withdraw(double amount) throws NotSufficientFundException {
        if (amount > balance) {
            throw new NotSufficientFundException("Not Sufficient Fund");
        }
        balance -= amount;
        System.out.println("Withdrawn: ₹" + amount + " | Balance: ₹" + balance);
    }
}

// Main class
public class BankApp {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        // Deposit
        account.deposit(1000.00);

        try {
            // Withdrawals
            account.withdraw(400.00);
            account.withdraw(300.00);
            account.withdraw(500.00); // This should throw exception

        } catch (NotSufficientFundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
