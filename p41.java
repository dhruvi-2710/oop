class VotingApp {

    // Method to check eligibility
    void checkEligibility(int age) {

        if (age < 18) {
            throw new IllegalArgumentException(
                "Age must be 18 or above to vote"
            );
        } else {
            System.out.println("Eligible to vote. Age = " + age);
        }
    }
}

// Main class
public class VotingDemo {
    public static void main(String[] args) {

        VotingApp app = new VotingApp();

        int[] testAges = {20, 16, 25};

        for (int age : testAges) {

            try {
                System.out.println("\nChecking age: " + age);
                app.checkEligibility(age);
            }
            catch (IllegalArgumentException e) {
                System.out.println("Exception: " + e.getMessage());
            }
            finally {
                System.out.println("Validation process completed");
            }
        }
    }
}
