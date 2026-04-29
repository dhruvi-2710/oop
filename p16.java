// Thread class
class SumThread extends Thread {
    private int start, end;
    private long sum = 0;

    // Constructor
    SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // Run method
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("Sum from " + start + " to " + end + " = " + sum);
    }

    // Getter to return result
    public long getSum() {
        return sum;
    }
}

// Main class
public class ThreadSumDemo {
    public static void main(String[] args) {

        // Create threads
        SumThread t1 = new SumThread(1, 1000);
        SumThread t2 = new SumThread(1001, 2000);

        // Start threads (parallel execution)
        t1.start();
        t2.start();

        try {
            // Wait for both threads to finish
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Combine results
        long total = t1.getSum() + t2.getSum();

        System.out.println("Final Total Sum = " + total);
    }
}
