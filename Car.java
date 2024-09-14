public class Car {
    private String id;
    private String model;
    private String brand;
    private String type;
    public double rentalPricePerDay;
    private boolean isAvailable;
    private static int carCount = 0;

    public Car() {
        this.id = "0";
        this.model = "Unknown Model";
        this.brand = "Unknown Brand";
        this.type = "Unknown Type";
        this.rentalPricePerDay = 0.0;
        this.isAvailable = true;
        carCount++;
    }

    public Car(String id, String model, String brand, String type, double rentalPricePerDay) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.type = type;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isAvailable = true;
        carCount++;
    }
    public String getId() {
        return this.id; 
    }

    public boolean isAvailable() {
        return this.isAvailable; 
    }

    public void rent() {
        this.isAvailable = false; 
    }

    public void returnCar() {
        this.isAvailable = true; 
    }
    
    public String getDetails() {
        return "Car ID: " + id + ", Model: " + model + ", Brand: " + brand + ", Type: " + type + ", Price per Day: $" + rentalPricePerDay;
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
