package pratikum_2.bagian_5.abstrak;

public class Main {

    public static void main(String[] args) {

        Anjing a = new Anjing();
        a.nama = "Anjing";
        a.makan();
        a.bersuara();

        Kucing k = new Kucing();
        k.nama = "Kucing";
        k.makan();
        k.bersuara();
    }
}