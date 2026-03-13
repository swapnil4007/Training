package com.msedcl.main.Service;

import org.springframework.stereotype.Component;

@Component
public class CardPaymentService implements PaymentService {
	
	
	@Override
	public void doPayment() {
		System.out.println("Payment done using Card");
	}

}
