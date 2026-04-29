
// Abstract class
abstract class Vehicle {

    // Abstract methods
    abstract String fuelType();
    abstract int noOfWheels();
}

// Subclass: Car
class Car extends Vehicle {

    String fuel;

    Car(String fuel) {
        this.fuel = fuel;
    }

    @Override
    String fuelType() {
        return fuel;
    }

    @Override
    int noOfWheels() {
        return 4;
    }
}

// Subclass: Bike
class Bike extends Vehicle {

    @Override
    String fuelType() {
        return "Petrol";
    }

    @Override
    int noOfWheels() {
        return 2;
    }
}

// Main class
public class VehicleDemo {
    public static void main(String[] args) {

        // Car object (can be Petrol or Diesel)
        Vehicle car = new Car("Diesel");

        // Bike object
        Vehicle bike = new Bike();

        // Display details
        System.out.println("Car:");
        System.out.println("Fuel Type: " + car.fuelType());
        System.out.println("No of Wheels: " + car.noOfWheels());

        System.out.println("\nBike:");
        System.out.println("Fuel Type: " + bike.fuelType());
        System.out.println("No of Wheels: " + bike.noOfWheels());
    }
}
