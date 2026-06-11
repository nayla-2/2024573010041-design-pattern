package praktikum_7.bagian_1;

public class DrivingRoute implements RouteStrategy {

    @Override
    public void buildRoute(String from, String to) {
        System.out.println("Membuat rute kendaraan dari " + from + " ke " + to);
    }
}