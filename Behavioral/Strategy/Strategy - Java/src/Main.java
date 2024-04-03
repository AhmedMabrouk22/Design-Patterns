import MessageFormatterExample.*;
import ecommerceExample.*;
import notificationServiceExample.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("========= E-commerce Example ========== ");
        double totalPricing = 0;
        Product p1 = new Product("Laptop", 1000, new PremiumPricingStrategy());
        totalPricing += p1.calculatePricing();
        Product p2 = new Product("Mobile", 500, new PremiumPricingStrategy());
        totalPricing += p2.calculatePricing();
        new Checkout(new PaypalPaymentStrategy()).pay(totalPricing);

        totalPricing = 0;
        p1 = new Product("Laptop", 1000, new RegularPricingStrategy());
        totalPricing += p1.calculatePricing();
        p2 =  new Product("Mobile", 500, new RegularPricingStrategy());
        totalPricing += p2.calculatePricing();
        new Checkout(new VisaCardPaymentStrategy()).pay(totalPricing);

        System.out.println();
        System.out.println();
        System.out.println("========= Notification Services Example ========== ");
        User user1 = new User("ahmed@email.com","123456789","ahmed");
        Notification not1 = new Notification(new EmailNotificationStrategy());
        not1.send(user1,"message");

        not1 = new Notification(new SMSNotificationStrategy());
        not1.send(user1,"message");

        System.out.println();
        System.out.println();
        System.out.println("========= Message Formatter Example ========== ");
        MessageFormatter m = new MessageFormatter("Message", new JsonMessageFormatter());
        System.out.println(m.format());
        System.out.println(m.getType());



    }
}