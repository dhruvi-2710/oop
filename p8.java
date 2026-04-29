class University {

    // Static data members
    static int totalStudents;
    static String universityName;

    // Static block (executes once when class is loaded)
    static {
        universityName = "ABC University";
        System.out.println("Static Block Executed: University Name Initialized");
    }

    // Instance block (executes every time an object is created, before constructor)
    {
        System.out.println("Instance Block Executed: A student object is being created");
    }

    // Constructor
    University() {
        totalStudents++;
        System.out.println("Constructor Executed: Student added");
    }

    // Static method
    static int getTotalStudents() {
        return totalStudents;
    }
}

public class UniversityDemo {
    public static void main(String[] args) {

        System.out.println("Main Method Started");

        // Creating objects
        University s1 = new University();
        University s2 = new University();
        University s3 = new University();

        // Display total students
        System.out.println("Total Students: " + University.getTotalStudents());
        System.out.println("University Name: " + University.universityName);
    }
}
