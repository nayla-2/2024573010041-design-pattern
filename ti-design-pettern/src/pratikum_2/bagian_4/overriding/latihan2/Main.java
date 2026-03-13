package pratikum_2.bagian_4.overloading.latihan;

public class Main {

    public static void main(String[] args) {

        Matematika mtk = new Matematika();

        System.out.println("Penjumlahan 2 bilangan int: " + mtk.tambah(5, 3));
        System.out.println("Penjumlahan 3 bilangan int: " + mtk.tambah(5, 3, 2));
        System.out.println("Penjumlahan 2 bilangan double: " + mtk.tambah(2.5, 3.5));

    }
}