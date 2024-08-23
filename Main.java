public class Main{
    public static void main(String[] args){
    
        Car car1 = new Car("1", "Model S", "Tesla", "Electric", 100);
        Car car2 = new Car("2", "Civic", "Honda", "Sedan", 50);

        Customer customer1 = new Customer("C1", "John Doe", "john@example.com");
        Customer customer2 = new Customer("C2", "Jane Smith", "jane@example.com");

        System.out.println(car1.getDetails());
        System.out.println(car2.getDetails());

        System.out.println(customer1.getDetails());
        System.out.println(customer2.getDetails());


    }
}