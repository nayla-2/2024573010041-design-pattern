package praktikum_7.latihan1;

public class BankTransferPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Pembayaran Rp" + amount + " menggunakan Transfer Bank.");
    }
}