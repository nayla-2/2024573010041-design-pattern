package praktikum_7.latihan1;

public class Main {

    public static void main(String[] args) {

        Checkout checkout = new Checkout();

        checkout.setPaymentStrategy(new CreditCardPayment());
        checkout.processPayment(500000);

        checkout.setPaymentStrategy(new EWalletPayment());
        checkout.processPayment(250000);

        checkout.setPaymentStrategy(new BankTransferPayment());
        checkout.processPayment(750000);
    }
}