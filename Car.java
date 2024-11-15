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
    @Override
    public double calculateRentalCost(int days) {
        double rentalCost = days * rentalPricePerDay;
        return DiscountManager.applyDiscount(discountPolicy, rentalCost);
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
    @Override
    public String getDetails() {
        return super.getDetails() + ", Rental Price Per Day: " + rentalPricePerDay;
    }
}
