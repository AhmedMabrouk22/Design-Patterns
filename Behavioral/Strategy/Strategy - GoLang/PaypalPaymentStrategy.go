package main

import "fmt"

type PaypalPaymentStrategy struct {
}

func (p *PaypalPaymentStrategy) pay(price float64) {
	fmt.Println("Paying", price, "using Paypal")
}
