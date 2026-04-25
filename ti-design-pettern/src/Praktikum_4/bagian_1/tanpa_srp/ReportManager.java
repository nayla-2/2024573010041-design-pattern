package Praktikum_4.bagian_1.tanpa_srp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReportManager {

    private final String content;

    public ReportManager(String content) {
        this.content = content;
    }
    public String generateReport() {
        return "=== LAPORAN ===\n" + content + "\n===============";
    }

    public void saveToFile(String filename) {
        File file = new File(filename);

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(generateReport());
            System.out.println("Laporan disimpan ke file: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Gagal menyimpan laporan: " + e.getMessage());
        }
    }

    public void printReport() {
        System.out.println("\nLaporan yang dicetak:\n" + generateReport());
    }
}