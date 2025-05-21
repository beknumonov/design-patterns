package solid.SRP.good_design;

public class EmailService {

    public void sendEmail(Invoice invoice) {
        System.out.println("Sending email notification to " + invoice.getEmail());
    }
}
