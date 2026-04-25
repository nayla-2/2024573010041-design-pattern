package Praktikum_4.bagian_1.tanpa_srp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan isi laporan: ");
        String reportText = scanner.nextLine();

        System.out.print("Masukkan nama file laporan: ");
        String reportFileName = scanner.nextLine();

        ReportManager manager = new ReportManager(reportText);

        manager.printReport();
        manager.saveToFile(reportFileName + ".txt");

        scanner.close();
    }
}
