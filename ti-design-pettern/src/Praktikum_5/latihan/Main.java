package Praktikum_5.latihan;

public class Main {

    public static void main(String[] args) {

        TaxCalculator calculator = new TaxCalculator();

        System.out.println("Car Tax: " +
                calculator.calculateTax(new CarTax(), 100000));

        System.out.println("Motorcycle Tax: " +
                calculator.calculateTax(new MotorcycleTax(), 100000));

        System.out.println("Truck Tax: " +
                calculator.calculateTax(new TruckTax(), 100000));
    }
}