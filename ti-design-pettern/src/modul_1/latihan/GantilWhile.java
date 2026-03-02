package modul_1.latihan;

public class GantilWhile {
    public static void main(String[] args) {

        System.out.println("Bilangan ganjil 2-44 (While):");
        int i = 2;
        while (i <= 44) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
