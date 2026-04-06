package praktikum_2.latihan.latihan_2;

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran();

        lingkaran1.jariJari = 7;

        double luas = lingkaran1.hitungLuas();

        System.out.println("Jari-jari : " + lingkaran1.jariJari);
        System.out.println("Luas Lingkaran : " + luas);
    }
}
