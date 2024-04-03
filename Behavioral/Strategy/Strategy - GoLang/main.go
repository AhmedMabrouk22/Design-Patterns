package main

func main() {
	totalPricing := 0.0
	p1 := &Product{
		Name:            "Laptop",
		Price:           1000,
		PricingStrategy: &RegularPricingStrategy{},
	}
	p2 := &Product{
		Name:            "Mobile",
		Price:           500,
		PricingStrategy: &RegularPricingStrategy{},
	}
	totalPricing += p1.calculatePricing()
	totalPricing += p2.calculatePricing()
	checkout := &Checkout{
		PaymentStrategy: &PaypalPaymentStrategy{},
	}
	checkout.checkout(totalPricing)

	totalPricing = 0.0

	p1 = &Product{
		Name:            "Laptop",
		Price:           1000,
		PricingStrategy: &PremiumPricingStrategy{},
	}
	p2 = &Product{
		Name:            "Mobile",
		Price:           500,
		PricingStrategy: &PremiumPricingStrategy{},
	}
	totalPricing += p1.calculatePricing()
	totalPricing += p2.calculatePricing()
	checkout = &Checkout{
		PaymentStrategy: &VisaCardPaymentStrategy{},
	}
	checkout.checkout(totalPricing)

}
