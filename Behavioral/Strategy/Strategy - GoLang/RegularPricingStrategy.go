package main

type RegularPricingStrategy struct {
}

func (r *RegularPricingStrategy) pay(price float64) float64 {
	return price
}
