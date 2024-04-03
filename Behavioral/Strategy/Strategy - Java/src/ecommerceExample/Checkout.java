package ecommerceExample;

// Context Class
public class Checkout {
    private final PaymentStrategy paymentStrategy;

    public Checkout(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double price)
    {
        paymentStrategy.pay(price);
    }
}
