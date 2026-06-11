package praktikum_7.bagian_2;

public class Main {

    public static void main(String[] args) {

        PhotoEditor editor = new PhotoEditor();

        editor.setFilter(new BlackWhiteFilter());
        editor.applyFilter("foto1.jpg");

        editor.setFilter(new BringhtFilter());
        editor.applyFilter("foto2.jpg");

        editor.setFilter(new SepiFilter());
        editor.applyFilter("foto3.jpg");
    }
}