package ecommerceExample;

public class PremiumPricingStrategy implements PricingStrategy{

    @Override
    public double calculatePricing(double price) {
        return price * 0.8;
    }
}
