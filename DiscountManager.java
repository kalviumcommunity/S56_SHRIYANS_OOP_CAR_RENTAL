public class DiscountManager {
    public static double applyDiscount(DiscountPolicy discountPolicy, double rentalCost) {
        return discountPolicy.applyDiscount(rentalCost);
    }
}
