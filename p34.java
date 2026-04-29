// Base class
class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    // Open account
    void openAccount(String accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    // Deposit
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    // Withdraw
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        }
    }

    // Check balance
    void checkBalance() {
        System.out.println("Balance: ₹" + balance);
    }
}

// Subclass: SavingAccount
class SavingAccount extends BankAccount {

    // Calculate interest (simple interest example)
    void calculateInterest(double rate) {
        double interest = (balance * rate) / 100;
        System.out.println("Interest Earned: ₹" + interest);
    }
}

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {

    // Calculate maturity amount
    void maturityAmount(double rate, int time) {
        double maturity = balance + (balance * rate * time) / 100;
        System.out.println("Maturity Amount after " + time + " years: ₹" + maturity);
    }
}

// Main class
public class BankDemo {
    public static void main(String[] args) {

        // Saving Account
        SavingAccount sa = new SavingAccount();
        sa.openAccount("SA101", "Amit", 10000);
        sa.deposit(2000);
        sa.withdraw(3000);
        sa.checkBalance();
        sa.calculateInterest(5);

        System.out.println();

        // Fixed Deposit Account
        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount("FD201", "Riya", 20000);
        fd.checkBalance();
        fd.maturityAmount(7, 2);
    }
}
