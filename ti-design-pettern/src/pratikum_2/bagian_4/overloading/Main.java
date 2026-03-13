package pratikum_2.bagian_4.overloading;

public class Main {

    public static void main(String[] args) {

        Kalkulator kalkulator = new Kalkulator();

        System.out.println("2 + 3 = " + kalkulator.tambah(2, 3));
        System.out.println("1 + 2 + 3 = " + kalkulator.tambah(1, 2, 3));
        System.out.println("2.5 + 3.5 = " + kalkulator.tambah(2.5, 3.5));

    }
}