package main

type Checkout struct {
	PaymentStrategy PaymentStrategy
}

func (p *Checkout) checkout(price float64) {
	p.PaymentStrategy.pay(price)
}
