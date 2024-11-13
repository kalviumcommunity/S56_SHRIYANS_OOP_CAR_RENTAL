public class WeekendDiscount implements DiscountPolicy {
    @Override
    public double applyDiscount(double rentalCost) {
        return rentalCost * 0.9; // 10% discount
    }
}
