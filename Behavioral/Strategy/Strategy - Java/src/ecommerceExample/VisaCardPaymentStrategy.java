package ecommerceExample;

public class VisaCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double price) {
        System.out.println("Paying " + price + " using Visa Card");
    }
}
