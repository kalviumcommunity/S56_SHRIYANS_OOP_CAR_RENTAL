public class ElectricCar extends Car {
    private int batteryRange;

    public ElectricCar(String id, String model, String brand, double rentalPricePerDay, int batteryRange) {
        super(id, model, brand, "Electric", rentalPricePerDay);
        this.batteryRange = batteryRange;
    }

    public int getBatteryRange() {
        return batteryRange;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Battery Range: " + batteryRange + " Km";
    }
}
