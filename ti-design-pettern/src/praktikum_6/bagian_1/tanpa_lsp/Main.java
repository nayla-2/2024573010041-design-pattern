package praktikum_6.bagian_1.tanpa_lsp;

public class Main {
    public static void testRectangle(Rectangle r) {
        r.setWidth(5);
        r.setHeigth(4);

        System.out.println(
                "Hasil yang diharapkan: 20, Hasil output: "
                        + r.calculateArea()
        );
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        testRectangle(rect);

        Rectangle square = new Square();
        testRectangle(square);
    }
}