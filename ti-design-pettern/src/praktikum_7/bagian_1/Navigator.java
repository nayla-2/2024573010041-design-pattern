package praktikum_7.bagian_1;

public class Navigator {

    private RouteStrategy routeStrategy;

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void buildRoute(String from, String to) {
        routeStrategy.buildRoute(from, to);
    }
}