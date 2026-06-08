package praktikum_6.latihan1;

public class Bicycle extends Vehicle {

    @Override
    public void startEngine() {
        throw new UnsupportedOperationException(
                "Bicycles don't have engines!");
    }

    @Override
    public void navigateTo(String destination) {
        System.out.println(
                "Calculating bike route to " + destination);
    }
}