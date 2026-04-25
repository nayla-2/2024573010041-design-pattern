package Praktikum_5.latihan;

public class CarTax implements TaxStrategy {

    @Override
    public double calculateTax(double price) {
        return price * 0.1; // 10%
    }
}
