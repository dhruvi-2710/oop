import java.util.Scanner;

// Outer class
class College {
    String collegeName;

    // Constructor
    College(String collegeName) {
        this.collegeName = collegeName;
    }

    // Non-static inner class
    class Admission {
        String studentName;
        String course;

        // Method to accept student details
        void inputDetails() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course: ");
            course = sc.nextLine();
        }

        // Method to display details
        void displayDetails() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name: " + collegeName); // accessing outer class
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }
}

// Main class
public class CollegeDemo {
    public static void main(String[] args) {

        // Create outer class object
        College col = new College("ABC College");

        // Create inner class object
        College.Admission adm = col.new Admission();

        // Input and display
        adm.inputDetails();
        adm.displayDetails();
    }
}
