package pratikum_2.bagian_4.overriding.latihan1;

class Lingkaran extends BangunDatar {

    int r = 7;

    @Override
    void hitungLuas() {
        double luas = 3.14 * r * r;
        System.out.println("Luas Lingkaran: " + luas);
    }
}