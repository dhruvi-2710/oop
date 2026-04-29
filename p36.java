// Interface
interface Classify {
    String getDivision(double average);
}

// Implementing class
class Result implements Classify {

    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "No First Division";
        }
    }
}

// Main class
public class InterfaceDemo {
    public static void main(String[] args) {

        Result r = new Result();

        double avg1 = 75;
        double avg2 = 55;

        System.out.println("Average: " + avg1 + " → " + r.getDivision(avg1));
        System.out.println("Average: " + avg2 + " → " + r.getDivision(avg2));
    }
}
