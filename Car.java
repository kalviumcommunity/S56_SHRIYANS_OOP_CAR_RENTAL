public class Car {
    private String id;
    private String model;
    private String brand;
    private String type;
    public double rentalPricePerDay;
    private boolean isAvailable;

    public Car(String id, String model, String brand, String type, double rentalPricePerDay) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.type = type;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isAvailable = true;
    }
    
    public String getDetails() {
        return "Car ID: " + id + ", Model: " + model + ", Brand: " + brand + ", Type: " + type + ", Price per Day: $" + rentalPricePerDay;
    }

}
