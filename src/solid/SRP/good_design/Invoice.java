package solid.SRP.good_design;

public class Invoice {
    private double amount;
    private String email;


    public Invoice(double amount, String email) {
        this.amount = amount;
        this.email = email;
    }

    public void generateInvoice() {
        System.out.println("Invoice generated and printed for amount: " + amount);
    }

    public String getEmail() {
        return email;
    }
}
