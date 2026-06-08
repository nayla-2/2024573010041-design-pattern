package praktikum_6.bagian_1.tanpa_lsp;

public class Square extends Rectangle {

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeigth(width);
    }

    @Override
    public void setHeigth(int heigth) {
        super.setHeigth(heigth);
        super.setWidth(heigth);
    }
}