

// Shared class with synchronized method
class TablePrinter {

    // Synchronized method ensures one thread at a time
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));

            try {
                Thread.sleep(200); // just to show thread switching clearly
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}

// Thread class
class MyThread extends Thread {
    TablePrinter tp;
    int number;

    MyThread(TablePrinter tp, int number) {
        this.tp = tp;
        this.number = number;
    }

    public void run() {
        tp.printTable(number);
    }
}

// Main class
public class SyncTableDemo {
    public static void main(String[] args) {

        TablePrinter obj = new TablePrinter();

        // Two threads for different tables
        MyThread t1 = new MyThread(obj, 5);
        MyThread t2 = new MyThread(obj, 7);

        t1.start();
        t2.start();
    }
}
