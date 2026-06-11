package praktikum_7.latihan1;

public class EWalletPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Pembayaran Rp" + amount + " menggunakan E-Wallet.");
    }
}