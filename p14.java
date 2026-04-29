public class AverageDemo {

    // Method with throws clause
    public static double average(String[] values)
            throws NullPointerException, NumberFormatException {

        double sum = 0;

        for (int i = 0; i < values.length; i++) {

            // Check for null
            if (values[i] == null) {
                throw new NullPointerException("Null value found at index " + i);
            }

            // Convert string to double (may throw NumberFormatException)
            double num = Double.parseDouble(values[i]);
            sum += num;
        }

        return sum / values.length;
    }

    public static void main(String[] args) {

        // Test cases
        String[] validData = {"10", "20", "30"};
        String[] invalidData = {"10", "abc", "30"};
        String[] nullData = {"10", null, "30"};

        // 1. Valid input
        try {
            double result = average(validData);
            System.out.println("Average (valid): " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Finished valid test\n");
        }

        // 2. Invalid number
        try {
            double result = average(invalidData);
            System.out.println("Average (invalid): " + result);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other Error: " + e);
        } finally {
            System.out.println("Finished invalid number test\n");
        }

        // 3. Null value
        try {
            double result = average(nullData);
            System.out.println("Average (null): " + result);
        } catch (NullPointerException e) {
            System.out.println("Null Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other Error: " + e);
        } finally {
            System.out.println("Finished null test");
        }
    }
}
