import java.util.ArrayList;

// Generic class
class Box<T> {
    private ArrayList<T> items = new ArrayList<>();

    // Method to add item
    void addItem(T item) {
        items.add(item);
    }

    // Method to display items
    void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}

// Main class
public class GenericDemo {
    public static void main(String[] args) {

        // Box for Strings (names)
        Box<String> nameBox = new Box<>();
        nameBox.addItem("Amit");
        nameBox.addItem("Riya");
        nameBox.addItem("Karan");

        // Box for Integers (roll numbers)
        Box<Integer> rollBox = new Box<>();
        rollBox.addItem(101);
        rollBox.addItem(102);
        rollBox.addItem(103);

        // Display items
        System.out.println("Names:");
        nameBox.displayItems();

        System.out.println("\nRoll Numbers:");
        rollBox.displayItems();
    }
}
