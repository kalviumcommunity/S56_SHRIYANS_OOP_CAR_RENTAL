public abstract class Vehicle {
    private String id;
    private String model;
    private String brand;
    private String type;

    public Vehicle(String id, String model, String brand, String type) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.type = type;
    }

    public abstract double calculateRentalCost(int days);

    public String getDetails() {
        return "Vehicle ID: " + id + ", Model: " + model + ", Brand: " + brand + ", Type: " + type;
    }
}
