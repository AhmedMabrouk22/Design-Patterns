package main

type PaymentStrategy interface {
	pay(price float64)
}
