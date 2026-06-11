package praktikum_6.latihan1;

public class Main {
    public static void beginTrip(Vehicle vehicle, String destination) {
        vehicle.startEngine();
        vehicle.navigateTo(destination);
    }

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bicycle();

        System.out.println("Car trip:");
        beginTrip(car, "Central park");

        System.out.println("\nBike trip:");
        try {
            beginTrip(bike, "Cental Pack");
        } catch (Exception e) {
            System.out.println("Eroor: " + e. getMessage());
        }
    }
}