package Praktikum_3.bagian_4.overloading.latihan1;

public class Main {
    public static void main(String[] args) {

        BangunDatar bd = new BangunDatar();
        Persegi p = new Persegi();
        Lingkaran l = new Lingkaran();

        bd.hitungLuas();

        System.out.println("Luas Persegi: " + p.hitungLuas(4));
        System.out.println("Luas Lingkaran: " + l.hitungLuas(7));
    }
}