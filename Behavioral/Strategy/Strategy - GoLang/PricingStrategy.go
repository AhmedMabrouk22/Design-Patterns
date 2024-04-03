package main

type PricingStrategy interface {
	pay(price float64) float64
}
