
// First thread: prints 1 to 10 (1 second delay)
class ThreadOne extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread 1: " + i);
                Thread.sleep(1000); // 1 second
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

// Second thread: prints 11 to 20 (500 ms delay)
class ThreadTwo extends Thread {
    public void run() {
        try {
            for (int i = 11; i <= 20; i++) {
                System.out.println("Thread 2: " + i);
                Thread.sleep(500); // 500 ms
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

// Main class
public class ThreadDemo {
    public static void main(String[] args) {

        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        // Start both threads
        t1.start();
        t2.start();
    }
}
