package net.unlucky.excursionticketapp;

public class DiscountUtil {
    public static int calculateDiscount(int price, int discount) {
        return (price / 100) * discount;
    }
}
