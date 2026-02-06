package customer;

public class Customer {

    private int customerId;
    private String name;
    private String address;
    private boolean active;

    public Customer(int customerId, String name, String address, boolean active) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.active = active;
    }


    public boolean isActive() {
        return active;
    }

    public String getName() {
        return name;
    }

    public void displayCustomer() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Active: " + active);
    }
}

