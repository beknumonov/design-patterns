package solid.ocp.good_design;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Processing payment via Credit Card: $" + amount);
    }
}
