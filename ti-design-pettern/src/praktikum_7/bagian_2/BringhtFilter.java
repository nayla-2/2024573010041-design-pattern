package praktikum_7.bagian_2;

public class BringhtFilter implements FilterStrategy {

    @Override
    public void apply(String fileName) {
        System.out.println("Menerapkan filter cerah pada " + fileName);
    }
}