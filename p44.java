
// Thread 1: 1 to 100
class T1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("T1: " + i);
        }
    }
}

// Thread 2: 101 to 200
class T2 extends Thread {
    public void run() {
        for (int i = 101; i <= 200; i++) {
            System.out.println("T2: " + i);
        }
    }
}

// Thread 3: 201 to 300
class T3 extends Thread {
    public void run() {
        for (int i = 201; i <= 300; i++) {
            System.out.println("T3: " + i);
        }
    }
}

// Main class
public class SequentialThreadDemo {
    public static void main(String[] args) {

        T1 t1 = new T1();
        T2 t2 = new T2();
        T3 t3 = new T3();

        try {
            // Start T1 and wait for it to finish
            t1.start();
            t1.join();

            // Start T2 and wait for it to finish
            t2.start();
            t2.join();

            // Start T3 and wait for it to finish
            t3.start();
            t3.join();

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
