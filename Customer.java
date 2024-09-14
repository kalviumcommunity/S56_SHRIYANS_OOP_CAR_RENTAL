public class Customer {
    private String id;
    private String name;
    private String email;
    private static int customerCount = 0;

    public Customer() {
        this.id = "0";
        this.name = "Unknown Name";
        this.email = "Unknown Email";
        customerCount++;
    }

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

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
