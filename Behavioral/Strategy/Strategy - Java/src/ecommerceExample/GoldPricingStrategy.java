package ecommerceExample;

public class GoldPricingStrategy implements PricingStrategy {

    @Override
    public double calculatePricing(double price) {
        return price * 0.9;
    }
}
