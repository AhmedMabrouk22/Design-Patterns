package ecommerceExample;


// Context Class
public class Product {
    private String name;
    private double price;

    private final PricingStrategy pricingStrategy;

    public Product(String name, double price, PricingStrategy pricingStrategy) {
        this.name = name;
        this.price = price;
        this.pricingStrategy = pricingStrategy;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // The context isn’t responsible for selecting an appropriate algorithm for the job
    // The context delegates the work to a linked strategy object instead of executing it on its own
    public double calculatePricing() {
        return pricingStrategy.calculatePricing(price);
    }

}
