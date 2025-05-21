package solid.OCP.good_design;

public class PaymentProcessor {

    public void processPayment(PaymentMethod method, double amount) {
        method.pay(amount);
    }
}
