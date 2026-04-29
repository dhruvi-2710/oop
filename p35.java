// Base class
class Employee {
    String name;
    String department;

    // Constructor
    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

// Subclass
class Manager extends Employee {
    int teamSize;
    String projectName;

    // Constructor
    Manager(String name, String department, int teamSize, String projectName) {
        super(name, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    // Overriding method
    @Override
    void displayDetails() {
        super.displayDetails(); // call base class method
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + projectName);
    }
}

// Main class
public class OverrideDemo {
    public static void main(String[] args) {

        // Base class object
        Employee e = new Employee("Amit", "HR");

        // Subclass object
        Manager m = new Manager("Riya", "IT", 8, "AI Project");

        // Method calls
        System.out.println("Employee Details:");
        e.displayDetails();

        System.out.println("\nManager Details:");
        m.displayDetails();

        System.out.println("\nUsing Runtime Polymorphism:");
        Employee ref = new Manager("Karan", "Finance", 5, "Audit Project");
        ref.displayDetails(); // calls Manager version
    }
}
