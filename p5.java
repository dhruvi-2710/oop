import java.util.Scanner;

class BankAccount {
    String accountId;
    String accountHolderName;
    double balance;

    // Method to assign values
    void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    // Method to display values
    void displayValues() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------");
    }

    // Static search method
    static void searchAccount(BankAccount[] accounts, String searchId) {
        boolean found = false;

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].accountId.equals(searchId)) {
                System.out.println("Account Found:");
                accounts[i].displayValues();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account not found.");
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create array of 5 accounts
        BankAccount[] accounts = new BankAccount[5];

        // Initialize accounts
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new BankAccount();

            System.out.println("Enter details for account " + (i + 1));

            System.out.print("Account ID: ");
            String id = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Balance: ");
            double bal = sc.nextDouble();
            sc.nextLine(); // clear buffer

            accounts[i].assignValues(id, name, bal);
        }

        // Display all accounts
        System.out.println("\nAll Accounts:");
        for (BankAccount acc : accounts) {
            acc.displayValues();
        }

        // Search account
        System.out.print("Enter Account ID to search: ");
        String searchId = sc.nextLine();

        BankAccount.searchAccount(accounts, searchId);

        sc.close();
    }
}
