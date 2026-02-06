import customer.Customer;
import order.Order;
import payment.Payment;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(101, "Malleswari", "Hyderabad", true);

        if (customer.isActive()) {

            customer.displayCustomer();

            Order order = new Order(1001, 2500);
            Payment payment = new Payment("UPI");

            boolean paymentStatus = payment.processPayment(order.calculateAmount());

            if (paymentStatus) {
                order.updateStatus("SUCCESS");
            } else {
                order.updateStatus("FAILED");
            }

            order.displayOrder();
        }
    }
}
