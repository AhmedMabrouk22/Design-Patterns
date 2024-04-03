package main

import "fmt"

type VisaCardPaymentStrategy struct {
}

func (v *VisaCardPaymentStrategy) pay(price float64) {
	fmt.Println("Paying", price, "using Visa Card")
}
