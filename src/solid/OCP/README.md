## Open-Closed Principle (OCP) Explanation

The Open-Closed Principle states that software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.

What does this mean? 
- You should be able to add new functionality without modifying existing code. 
- This prevents breaking already tested and stable code. 
- It can be achieved using inheritance, interfaces, or composition

### Example: A Payment System

Consider a bad implementation where a PaymentProcessor class uses multiple if-else conditions to handle different payment methods. This violates OCP because adding a new payment method requires modifying the class.

A better approach is to use abstraction (interface or abstract class) to allow new payment methods to be added without modifying the core PaymentProcessor class.

```public class PaymentProcessor {

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
```

### Problems:
- Every time a new payment method is added, this class must be modified, breaking OCP.
- If there are bugs, you risk breaking existing functionality.
- Hard to maintain and extend.


## Good Code (Following OCP)

```
// Step 1: Define an interface for Payment Method

public interface PaymentMethod {
    void pay(double amount);
}


// Step 2: Implement different payment methods

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Processing payment via Credit Card: $" + amount);
    }
}

public class DebitCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Processing payment via Debit Card: $" + amount);
    }
}

public class PayPalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Processing payment via PayPal: $" + amount);
    }
}

// Step 3: Modify PaymentProcessor to accept any PaymentMethod

public class PaymentProcessor {

    public void processPayment(PaymentMethod method, double amount) {
        method.pay(amount);
    }
}

// Step 4: Test the Code

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

Result: 
Processing payment via Credit Card: $100.0
Processing payment via Debit Card: $200.0
Processing payment via PayPal: $300.0

// Step 5: Add New Payment Method Without Modifying Existing Code

public class UPIPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Processing payment via UPI Payment: $" + amount);
    }
}

// Add the following code to main 
PaymentMethod upi = new UPIPayment();
processor.processPayment(upi, 400);

```

Benefits of This Approach 

✅ No Modification of Existing Code
- Adding a new payment method like UPIPayment did not require changes in PaymentProcessor.

✅ Extensibility
- New payment methods can be added simply by implementing PaymentMethod.

✅ Better Maintainability
- Each class has a single responsibility, making debugging and testing easier. 

✅ Polymorphism & Code Reusability
- PaymentProcessor calls the pay method on any PaymentMethod, leveraging runtime polymorphism.

### Conclusion
By following the Open-Closed Principle, we ensure that our code remains flexible, scalable, and maintainable. Instead of modifying existing classes, we extend them by adding new implementations.
