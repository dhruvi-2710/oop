import java.util.ArrayList;
import java.util.Collections;

public class MarksList {
    public static void main(String[] args) {

        // Create ArrayList to store marks
        ArrayList<Integer> marks = new ArrayList<>();

        // Add at least 5 marks
        marks.add(85);
        marks.add(92);
        marks.add(76);
        marks.add(88);
        marks.add(95);

        // Display all marks
        System.out.println("Student Marks:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        // Find highest and lowest marks
        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);

        System.out.println("\n\nHighest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
    }
}
