public class CommandLineCalc {
    public static void main(String[] args) {

        // Check if exactly 2 arguments are passed
        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers.");
            return;
        }

        // Convert arguments to numbers (double for flexibility)
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

        // Perform calculation (you can change to product if needed)
        double sum = num1 + num2;

        // Print result
        System.out.println("Sum = " + sum);
    }
}
