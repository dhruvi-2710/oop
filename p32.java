class VolumeCalculator {

    // Cube
    double calculateVolume(double side) {
        return side * side * side;
    }

    // Rectangular Cube (Cuboid)
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // Sphere
    double calculateVolume(float radius) {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }
}

// Main class
public class VolumeDemo {
    public static void main(String[] args) {

        VolumeCalculator vc = new VolumeCalculator();

        // Cube
        double cubeVol = vc.calculateVolume(3);
        System.out.println("Volume of Cube: " + cubeVol);

        // Rectangular Cube
        double cuboidVol = vc.calculateVolume(4, 5, 6);
        System.out.println("Volume of Rectangular Cube: " + cuboidVol);

        // Sphere
        double sphereVol = vc.calculateVolume(2.5f);
        System.out.println("Volume of Sphere: " + sphereVol);
    }
}
