import java.util.HashMap;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Convert to lowercase for case-insensitive counting
        sentence = sentence.toLowerCase();

        // Split sentence into words
        String[] words = sentence.split("\\s+");

        // HashMap to store word frequency
        HashMap<String, Integer> freq = new HashMap<>();

        // Count frequency
        for (String word : words) {
            if (freq.containsKey(word)) {
                freq.put(word, freq.get(word) + 1);
            } else {
                freq.put(word, 1);
            }
        }

        // Display result
        System.out.println("\nWord Frequency:");
        for (String key : freq.keySet()) {
            System.out.println(key + " -> " + freq.get(key));
        }

        sc.close();
    }
}
