package praktikum_7.bagian_2;

public class SepiFilter implements FilterStrategy {

    @Override
    public void apply(String fileName) {
        System.out.println("Menerapkan filter sepia pada " + fileName);
    }
}