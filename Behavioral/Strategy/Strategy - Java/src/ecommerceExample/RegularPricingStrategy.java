package ecommerceExample;

public class RegularPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePricing(double price) {
        return price;
    }

}
