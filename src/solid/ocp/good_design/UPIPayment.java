package solid.ocp.good_design;

public class UPIPayment implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Processing payment via UPI Payment: $" + amount);
    }
}
