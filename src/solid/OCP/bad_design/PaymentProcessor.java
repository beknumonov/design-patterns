package solid.OCP.bad_design;

public class PaymentProcessor {

    public void processPayment(String paymentMethod, double amount) {

        if (paymentMethod.equals("CreditCard")) {
            System.out.println("Processing payment via Credit Card: $" + amount);
        } else if (paymentMethod.equals("DebitCard")) {
            System.out.println("Processing payment via Debit Card: $" + amount);
        } else if (paymentMethod.equals("PayPal")) {
            System.out.println("Processing payment via Paypal: $" + amount);
        } else {
            throw new IllegalArgumentException("Unsupported payment method: " + paymentMethod);
        }
    }
}
