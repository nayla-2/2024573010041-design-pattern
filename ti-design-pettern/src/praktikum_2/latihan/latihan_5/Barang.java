package praktikum_2.latihan.latihan_5;

public class Barang {
    String namaBarang;
    double harga;

    // Default constructor
    public Barang() {
        namaBarang = "Tidak diketahui";
        harga = 0;
    }

    // Parameterized constructor
    public Barang(String namaBarang, double harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    // Method untuk menampilkan data
    public void tampilkan() {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga: " + harga);
    }
}