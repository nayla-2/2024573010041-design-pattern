package Praktikum_4.latihan;
import java.io.FileWriter;
import java.io.IOException;

public class OrderManager {

    private String product;
    private int quantity;
    private double price;

    public OrderManager(String product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public double calculateTotal() {
        return quantity * price;
    }

    public void saveOrder() {
        try (FileWriter writer = new FileWriter("orders.txt", true)) {
            writer.write(product + ", " + quantity + ", Rp" + calculateTotal() + "\n");
            System.out.println("Pesanan telah disimpan ke file orders.txt");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan pesanan: " + e.getMessage());
        }
    }

    public void printReceipt() {
        System.out.println("\n=== Struk Pesanan ===");
        System.out.println("Produk       : " + product);
        System.out.println("Jumlah       : " + quantity);
        System.out.println("Harga Satuan : Rp" + price);
        System.out.println("Total Harga  : Rp" + calculateTotal());
        System.out.println("=====================");
    }
}