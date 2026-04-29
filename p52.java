import java.util.LinkedList;

public class GenericSearch {

    // Generic method to search element
    public static <T> boolean searchElement(LinkedList<T> list, T element) {

        for (T item : list) {
            if (item.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // LinkedList of Integer (roll numbers)
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        rollNumbers.add(104);

        // Search in Integer list
        System.out.println("Roll number 102 found? " +
                searchElement(rollNumbers, 102));

        System.out.println("Roll number 110 found? " +
                searchElement(rollNumbers, 110));

        // LinkedList of String (names)
        LinkedList<String> names = new LinkedList<>();
        names.add("Amit");
        names.add("Riya");
        names.add("Karan");

        // Search in String list
        System.out.println("\nName 'Riya' found? " +
                searchElement(names, "Riya"));

        System.out.println("Name 'John' found? " +
                searchElement(names, "John"));
    }
}
