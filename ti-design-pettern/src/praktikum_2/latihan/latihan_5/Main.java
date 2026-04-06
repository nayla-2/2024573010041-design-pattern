package praktikum_2.latihan.latihan_5;

public class Main {
    public static void main(String[] args) {

        // Object dengan default constructor
        Barang barang1 = new Barang();

        // Object dengan parameterized constructor
        Barang barang2 = new Barang("Laptop", 7500000);

        // Menampilkan data
        System.out.println("Barang 1:");
        barang1.tampilkan();

        System.out.println("\nBarang 2:");
        barang2.tampilkan();
    }
}