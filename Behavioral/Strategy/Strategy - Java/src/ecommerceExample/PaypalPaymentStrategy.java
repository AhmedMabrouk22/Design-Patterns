package ecommerceExample;

public class PaypalPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double price) {
        System.out.println("Paying " + price + " using Paypal");
    }
}
