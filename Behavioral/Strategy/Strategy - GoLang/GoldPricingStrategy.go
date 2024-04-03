package main

type GoldPricingStrategy struct {
}

func (g *GoldPricingStrategy) pay(price float64) float64 {
	return price * 0.9
}
