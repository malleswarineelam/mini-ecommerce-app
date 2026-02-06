package payment;

public class Payment {

    private String mode;

    public Payment(String mode) {
        this.mode = mode;
    }

    public boolean processPayment(double amount) {
        System.out.println("Payment of ₹" + amount + " processed using " + mode);
        return true;
    }
}

