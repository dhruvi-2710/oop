class Vehicle {
    // Protected members (accessible in subclasses)
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    // Constructor
    Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass Car
class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean ACavailable;

    // Constructor chaining using super
    Car(String vehicleNumber, String brand, String fuelType, int seats, boolean ac) {
        super(vehicleNumber, brand, fuelType);
        this.numberOfSeats = seats;
        this.ACavailable = ac;
    }

    // Override method
    @Override
    void displayDetails() {
        super.displayDetails(); // call parent method
        System.out.println("Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

// Subclass ElectricCar
class ElectricCar extends Car {
    private double batteryCapacity;
    private double chargingTime;

    // Constructor chaining
    ElectricCar(String vehicleNumber, String brand, String fuelType,
                int seats, boolean ac, double batteryCapacity, double chargingTime) {
        super(vehicleNumber, brand, fuelType, seats, ac);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    // Override method
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }

    // Subclass-specific method
    void showElectricInfo() {
        System.out.println("Electric Car Special Feature Accessed!");
    }
}

// Main class
public class VehicleDemo {
    public static void main(String[] args) {

        // Creating objects
        Vehicle v1 = new Vehicle("GJ01AB1234", "Tata", "Petrol");
        Car c1 = new Car("GJ02CD5678", "Hyundai", "Diesel", 5, true);
        ElectricCar e1 = new ElectricCar("GJ03EF9999", "Tesla", "Electric", 5, true, 75.0, 1.5);

        System.out.println("---- Vehicle ----");
        v1.displayDetails();

        System.out.println("\n---- Car ----");
        c1.displayDetails();

        System.out.println("\n---- Electric Car ----");
        e1.displayDetails();

        // Upcasting
        System.out.println("\n---- Upcasting ----");
        Vehicle v2 = new Car("GJ04XY1111", "Honda", "Petrol", 4, false);
        v2.displayDetails(); // calls overridden method

        // Downcasting with instanceof
        System.out.println("\n---- Downcasting ----");
        if (v2 instanceof Car) {
            Car c2 = (Car) v2;
            System.out.println("Downcasting successful: Accessing Car details");
            c2.displayDetails();
        }

        // Downcasting ElectricCar
        Vehicle v3 = new ElectricCar("GJ05ZZ2222", "MG", "Electric", 5, true, 50.0, 2.0);

        if (v3 instanceof ElectricCar) {
            ElectricCar e2 = (ElectricCar) v3;
            System.out.println("\nDowncasting to ElectricCar:");
            e2.showElectricInfo();
        }
    }
}
