public class Customer {
    private String id;
    private String name;
    private String email;
    private static int customerCount = 0;

    public Customer(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        customerCount++;
    }

    public String getDetails() {
        return "Customer ID: " + id + ", Name: " + name + ", Email: " + email;
    }

    public static int getCustomerCount() {
        return customerCount;
    }

}
