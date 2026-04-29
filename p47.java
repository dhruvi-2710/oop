import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class StudentFileDemo {

    public static void main(String[] args) {

        String fileName = "students.txt";

        // Try block for writing file
        FileWriter fw = null;
        BufferedReader br = null;

        try {
            // -------- WRITE TO FILE --------
            fw = new FileWriter(fileName);

            fw.write("101 Amit 85\n");
            fw.write("102 Riya 90\n");
            fw.write("103 Karan 78\n");

            fw.flush();
            System.out.println("Student records written successfully.\n");

            // -------- READ FROM FILE --------
            br = new BufferedReader(new FileReader(fileName));

            System.out.println("Student Records:");

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            try {
                if (fw != null) fw.close();
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }

            System.out.println("\nFile operation completed.");
        }
    }
}
