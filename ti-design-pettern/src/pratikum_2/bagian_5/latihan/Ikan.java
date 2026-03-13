package pratikum_2.bagian_5.latihan;

public class Ikan extends HewanAir implements Berenang {

    @Override
    void makan() {
        System.out.println(nama + " sedang makan di air.");
    }

    @Override
    public void berenang() {
        System.out.println(nama + " sedang berenang.");
    }
}