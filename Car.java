public class Car extends Vehicle {
    public double rentalPricePerDay;
    private boolean isAvailable;
    private static int carCount = 0;

    public Car(String id, String model, String brand, String type, double rentalPricePerDay) {
        super(id, model, brand, type); 
        this.rentalPricePerDay = rentalPricePerDay;
        this.isAvailable = true;
        carCount++;
    }

    public Car() {
        super("0", "Unknown Model", "Unknown Brand", "Unknown Type"); 
        this.rentalPricePerDay = 0.0;
        this.isAvailable = true;
        carCount++;
    }

    @Override
    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void rent() {
        this.isAvailable = false;
    }

    public void returnCar() {
        this.isAvailable = true;
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
}
