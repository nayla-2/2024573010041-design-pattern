package praktikum_2.bagian_5;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(); // default
        Person person2 = new Person("Budi", 25); // parameter

        person1.tampilkanInfo();
        person2.tampilkanInfo();
    }
}