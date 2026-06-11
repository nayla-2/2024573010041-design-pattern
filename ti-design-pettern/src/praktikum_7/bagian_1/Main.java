package praktikum_7.bagian_1;

public class Main {

    public static void main(String[] args) {

        Navigator navigator = new Navigator();

        navigator.setRouteStrategy(new DrivingRoute());
        navigator.buildRoute("Lhokseumawe", "Banda Aceh");

        navigator.setRouteStrategy(new PublicTransportRoute());
        navigator.buildRoute("Lhokseumawe", "Medan");

        navigator.setRouteStrategy(new WalkingRoute());
        navigator.buildRoute("Kampus", "Perpustakaan");
    }
}