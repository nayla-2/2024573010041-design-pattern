package modul_1.latihan;

public class GanjilFor {
    public static void main(String[] args) {

        System.out.println("Bilangan ganjil 5-50 (For):");
        for (int i = 5; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}