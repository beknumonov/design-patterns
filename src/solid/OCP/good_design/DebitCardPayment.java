package solid.OCP.good_design;

public class DebitCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Processing payment via Debit Card: $" + amount);
    }
}
