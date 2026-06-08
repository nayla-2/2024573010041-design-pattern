package praktikum_6.bagian_1.tanpa_lsp;

public class Rectangle {
    protected int width;
    protected int heigth;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int calculateArea() {
        return width * heigth;
    }
}