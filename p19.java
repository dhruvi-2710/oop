import java.util.*;

// Generic method class
public class GenericSortDemo {

    // Generic method to sort list
    public static <T extends Comparable<T>> void sortList(List<T> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {

        // Integer list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(3);

        System.out.println("Numbers before sorting: " + numbers);
        sortList(numbers);
        System.out.println("Numbers after sorting: " + numbers);

        System.out.println();

        // String list
        ArrayList<String> names = new ArrayList<>();
        names.add("Riya");
        names.add("Amit");
        names.add("Karan");
        names.add("Zoya");

        System.out.println("Names before sorting: " + names);
        sortList(names);
        System.out.println("Names after sorting: " + names);
    }
}
