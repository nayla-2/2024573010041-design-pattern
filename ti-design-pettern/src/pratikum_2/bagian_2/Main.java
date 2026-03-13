package pratikum_2.bagian_2;

public class Main {
    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa();

        mhs.setNama("nia");
        mhs.setUmur(21);

        System.out.println("Nama : " + mhs.getNama());
        System.out.println("Umur : " + mhs.getUmur());
    }
}