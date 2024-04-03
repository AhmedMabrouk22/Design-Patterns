package main

type PremiumPricingStrategy struct {
}

func (p *PremiumPricingStrategy) pay(price float64) float64 {
	return price * 0.8
}
