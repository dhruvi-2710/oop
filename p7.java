class LoanCalculator {

    // Home Loan EMI
    void calculateEMI(int principal, int time, float rate) {
        float monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                     (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("Home Loan EMI: ₹" + emi);
    }

    // Vehicle Loan EMI
    void calculateEMI(double principal, int time, double rate) {
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                     (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("Vehicle Loan EMI: ₹" + emi);
    }

    // Personal Loan EMI (fixed 10% rate)
    void calculateEMI(int principal, int time) {
        double rate = 10.0;
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                     (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("Personal Loan EMI (10% fixed): ₹" + emi);
    }
}

public class LoanDemo {
    public static void main(String[] args) {

        LoanCalculator lc = new LoanCalculator();

        // Home Loan
        lc.calculateEMI(500000, 10, 7.5f);

        // Vehicle Loan
        lc.calculateEMI(200000.0, 5, 9.0);

        // Personal Loan
        lc.calculateEMI(100000, 2);
    }
}
