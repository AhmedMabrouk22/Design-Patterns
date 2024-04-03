package main

type Product struct {
	Name            string
	Price           float64
	PricingStrategy PricingStrategy
}

func (p *Product) calculatePricing() float64 {
	return p.PricingStrategy.pay(p.Price)
}
