package pratikum_2.bagian_3.pewarisan;

public class Mobil extends Kendaraan {
    int jumlahPintu;

    void displayInfoMobil() {
        displayInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
