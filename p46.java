import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStats {

    public static void main(String[] args) {

        // Check if filename is provided
        if (args.length != 1) {
            System.out.println("Usage: java FileStats <filename>");
            return;
        }

        String fileName = args[0];

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = br.readLine()) != null) {

                lineCount++;

                // Count characters (including spaces)
                charCount += line.length();

                // Count words using whitespace split
                String[] words = line.trim().split("\\s+");

                // Handle empty lines
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            br.close();

            System.out.println("File Analysis:");
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
