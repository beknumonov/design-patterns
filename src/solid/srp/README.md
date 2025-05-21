## The Single Responsibility Principle (SRP)
The Single Responsibility Principle (SRP) states that a class should have only one reason to change, meaning it should have only one responsibility.

### Example of Bad Design

Let's consider an Invoice class that handles:
1. Invoice details
2. Generating and printing invoices
3. Saving invoices to the database
4. Sending email notifications

```
public class Invoice {
    private double amount;
    private String email;

    public Invoice(double amount, String email) {
        this.amount = amount;
        this.email = email;
    }

    public void generateInvoice(){
        System.out.println("Invoice generated and printed for amount: "+amount);
    }

    public void saveToDatabase(){
        System.out.println("Saving invoice to database...");
    }
    public void sendEmailNotificatio(){
        System.out.println("Sending email notification for invoice...");
    }
}
```

Why is this a bad design?
- The Invoice class is handling multiple responsibilities:
  - Invoice management (generateInvoice())
  - Database operations (saveToDatabase())
  - Email notifications (sendEmailNotification())
- If we change how emails are sent, we should not modify the Invoice class. 
- If we switch to a different database, we should not modify the Invoice class. 
- This violates SRP because the class has multiple reasons to change.


How does This Fixes SRP? 

Separation of Concerns – Each class has only one reason to change:
- Invoice – Manages invoice data. 
- InvoiceRepository – Handles database operations. 
- EmailService – Handles email notifications.

Now, if we change how emails are sent, we only modify EmailService, and if we change the database, we only modify InvoiceRepository.
This makes our code more maintainable, flexible, and easier to test! 🚀
