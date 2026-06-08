package praktikum_6.latihan1;

public class Main {

    public static void beginTrip(
            Vehicle vehicle,
            String destination) {

        vehicle.startEngine();
        vehicle.navigateTo(destination);
    }

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bicycle();

        System.out.println("Car trip:");
        beginTrip(car, "Central Park");

        System.out.println("\nBike trip:");

        try {
            beginTrip(bike, "Central Park");
        } catch (Exception e) {
            System.out.println(
                    "Error: " + e.getMessage());
        }
    }
}