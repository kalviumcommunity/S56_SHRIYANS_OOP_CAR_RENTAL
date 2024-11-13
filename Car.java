public class Car extends Vehicle {
    private double rentalPricePerDay;
    private boolean isAvailable;
    private static int carCount = 0;
    private DiscountPolicy discountPolicy;

    public Car(String id, String model, String brand, String type, double rentalPricePerDay) {
        super(id, model, brand, type);
        this.rentalPricePerDay = rentalPricePerDay;
        this.isAvailable = true;
        this.discountPolicy = new NoDiscount(); // Default policy
        carCount++;
    }

    public Car() {
        super("0", "Unknown Model", "Unknown Brand", "Unknown Type");
        this.rentalPricePerDay = 0.0;
        this.isAvailable = true;
        this.discountPolicy = new NoDiscount(); // Default policy
        carCount++;
    }

    @Override
    public double calculateRentalCost(int days) {
        double rentalCost = days * rentalPricePerDay;
        return discountPolicy.applyDiscount(rentalCost);
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public static int getCarCount() {
        return carCount;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }
}
