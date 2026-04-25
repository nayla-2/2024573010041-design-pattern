package Praktikum_5.bagian_2.dengan_ocp;

public class Main {

    public static void main(String[] args) {

        DiscountCalculator calculator = new DiscountCalculator();

        Discount regular = new RegularDiscount();
        Discount premium = new PremiumDiscount();

        System.out.println("Regular Discount: " +
                calculator.calculateDiscount(regular, 100));

        System.out.println("Premium Discount: " +
                calculator.calculateDiscount(premium, 100));
    }
}
