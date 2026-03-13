package pratikum_2.bagian_6;

class TiketReguler extends Tiket {
    public TiketReguler() {
        super("Reguler", 100000);
    }

    @Override
    public double hitungDiskon() {
        return 0; // diskon 10%
    }
}