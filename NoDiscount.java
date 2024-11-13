public class NoDiscount implements DiscountPolicy {
    @Override
    public double applyDiscount(double rentalCost) {
        return rentalCost;
    }
}
