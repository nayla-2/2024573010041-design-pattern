package praktikum_6.latihan1;

public class Car extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Car starts engine");
    }

    @Override
    public void navigateTo(String destination) {
        System.out.println("Calculating car route to " + destination);
    }
}