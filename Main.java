
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("1", "Model S", "Tesla", "Electric", 100));
        cars.add(new Car("2", "Civic", "Honda", "Sedan", 50));
        cars.add(new Car("3", "Accord", "Honda", "Sedan", 60));

        cars.add(new ElectricCar("4", "Leaf", "Nissan", 80, 240)); 
        cars.add(new ElectricCar("5", "Bolt", "Chevy", 90, 300)); 

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("C1", "John Doe", "john@example.com"));
        customers.add(new Customer("C2", "Jane Smith", "jane@example.com"));
        customers.add(new Customer());

        for (Car car : cars) {
            System.out.println(car.getDetails());
            System.out.println("Rental cost for 5 days: " + car.calculateRentalCost(5)); // Calculate rental cost for 5 days
        }
        System.out.println("----------------------------");
        for (Customer customer : customers) {
            System.out.println(customer.getDetails());
        }

        System.out.println("Total number of cars: " + Car.getCarCount());
        System.out.println("Total number of customers: " + Customer.getCustomerCount());
        RentalService.rentCar(cars.get(0));  // Rent the first car
        RentalService.returnCar(cars.get(0)); // Return the first car
    }
}
