package Praktikum_4.latihan;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Program Manajemen Pesanan ===");

        System.out.print("Masukkan nama produk: ");
        String product = scanner.nextLine();

        System.out.print("Masukkan jumlah: ");
        int quantity = scanner.nextInt();

        System.out.print("Masukkan harga satuan: ");
        double price = scanner.nextDouble();

        OrderManager orderManager = new OrderManager(product, quantity, price);
        orderManager.saveOrder();
        orderManager.printReceipt();

        scanner.close();
    }
}