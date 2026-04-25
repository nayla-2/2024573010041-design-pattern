package Praktikum_4.bagian_1.dengan_srp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReportSaver {
    public void saveToFile(String filename, String content) {
        String folderPath = "laporan/";
        File file = new File(folderPath + filename);

        if (file.getParentFile() != null) {
            file.getParentFile().mkdirs();
        }

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
            System.out.println("Laporan disimpan ke file: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Gagal menyimpan laporan: " + e.getMessage());
        }
    }
}