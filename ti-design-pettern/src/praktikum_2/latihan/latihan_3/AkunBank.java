package praktikum_2.latihan.latihan_3;

public class AkunBank {
    private double saldo;

    public AkunBank(double saldo) {
        this.saldo = saldo;
    }

    public void tampilkanSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}
