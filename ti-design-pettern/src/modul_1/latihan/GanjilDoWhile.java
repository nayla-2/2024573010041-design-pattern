package modul_1.latihan;

public class GanjilDoWhile {
    public static void main(String[] args) {

        System.out.println("Bilangan ganjil 8-80 (Do-While):");
        int i = 8;
        do {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 80);
    }
}
