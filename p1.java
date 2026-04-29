import java.util.Scanner;

public class ATMNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        int[] notes = {100, 50, 10, 5, 2, 1};

        System.out.println("Minimum number of notes:");

        for (int i = 0; i < notes.length; i++) {
            int count = amount / notes[i];
            if (count > 0) {
                System.out.println(notes[i] + " : " + count);
                amount = amount % notes[i];
            }
        }

        sc.close();
    }
}
