package solid.OCP.good_design;

public class Main {
    public static void main(String[] args) {

        PaymentProcessor processor=new PaymentProcessor();

        PaymentMethod creditCard=new CreditCardPayment();
        PaymentMethod debitCard=new DebitCardPayment();
        PaymentMethod paypal=new PayPalPayment();

        processor.processPayment(creditCard, 100);
        processor.processPayment(debitCard, 200);
        processor.processPayment(paypal, 300);
    }
}
