package Praktikum_5.bagian_1.dengan_ocp;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public void process(double amount) {
        System.out.println("Processing Credit Card payment of " + amount);
    }
}