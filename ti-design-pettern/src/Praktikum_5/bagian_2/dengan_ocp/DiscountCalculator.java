package Praktikum_5.bagian_2.dengan_ocp;

public class DiscountCalculator {

    public double calculateDiscount(Discount discount, double price) {
        return discount.applyDiscount(price);
    }
}