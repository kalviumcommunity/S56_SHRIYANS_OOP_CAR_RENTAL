import java.util.*;
public class Main{
    public static void main(String[] args){
    
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("1", "Model S", "Tesla", "Electric", 100));
        cars.add(new Car("2", "Civic", "Honda", "Sedan", 50));
        cars.add(new Car());


        // Java does not have a delete keyword, unlike C++ where delete is used to manually deallocate memory that was previously allocated with new.

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("C1", "John Doe", "john@example.com"));
        customers.add(new Customer("C2", "Jane Smith", "jane@example.com"));
        customers.add(new Customer());

        for(Car car : cars){
            System.out.println(car.getDetails());
        }
        System.out.println("----------------------------");
        for(Customer customer : customers){
            System.out.println(customer.getDetails());
        }

        // System.out.println(cars.get(0).isAvailable());
        // cars.get(0).rent();
        // System.out.println(cars.get(0).isAvailable());
        // cars.get(0).returnCar();
        // System.out.println(cars.get(0).isAvailable());

        System.out.println("Total number of cars: " + Car.getCarCount());
        System.out.println("Total number of customers: " + Customer.getCustomerCount());
        

    }
}