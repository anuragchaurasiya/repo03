// Concepts: inheritance, method overriding, polymorphism, and fare calculations.
package MyProfile;

class Ride {
    double calculateFare(double distance) {
        return 0.0;
    }
}

class BikeRide extends Ride {
    @Override
    double calculateFare(double distance) {
        return distance * 8;
    }
}

class AutoRide extends Ride {
    @Override
    double calculateFare(double distance) {
        return distance * 12;
    }
}

class CarRide extends Ride {
    @Override
    double calculateFare(double distance) {
        return distance * 18;
    }
}

public class Uber {
    public static void main(String[] args) {
        double distance = 10.5;

        Ride bike = new BikeRide();
        Ride auto = new AutoRide();
        Ride car = new CarRide();

        System.out.printf("Distance: %.1f km%n", distance);
        System.out.printf("Bike fare: ₹%.2f%n", bike.calculateFare(distance));
        System.out.printf("Auto fare: ₹%.2f%n", auto.calculateFare(distance));
        System.out.printf("Car fare: ₹%.2f%n", car.calculateFare(distance));
        System.out.println("Note: These are sample per-kilometre rates for OOP practice.");
    }
}