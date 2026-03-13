package pratikum_2.bagian_4.overriding.latihan1;

class Persegi extends BangunDatar {

    int sisi = 4;

    @Override
    void hitungLuas() {
        int luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
    }
}