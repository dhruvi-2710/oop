import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileAnalyzer {

    public static void main(String[] args) {

        String fileName = "data.txt";

        int lines = 0;
        int words = 0;
        int characters = 0; // excluding spaces and new lines

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(fileName));

            String line;

            while ((line = br.readLine()) != null) {

                lines++;

                // Remove leading/trailing spaces
                String trimmedLine = line.trim();

                // Count words
                if (!trimmedLine.isEmpty()) {
                    String[] wordArray = trimmedLine.split("\\s+");
                    words += wordArray.length;
                }

                // Count characters (excluding spaces)
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != ' ') {
                        characters++;
                    }
                }
            }

            System.out.println("File Analysis:");
            System.out.println("Total Lines: " + lines);
            System.out.println("Total Words: " + words);
            System.out.println("Total Characters (excluding spaces): " + characters);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());

        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }

            System.out.println("Program execution completed.");
        }
    }
}
