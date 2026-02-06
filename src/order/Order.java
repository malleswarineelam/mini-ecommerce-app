package order;

public class Order {

    private int orderId;
    private double amount;
    private String status;

    public Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
        this.status = "CREATED";
    }

    public double calculateAmount() {
        return amount;
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Amount: " + amount);
        System.out.println("Status: " + status);
    }
}

