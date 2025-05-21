package solid.ocp.good_design;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Processing payment via PayPal: $" + amount);
    }
}
