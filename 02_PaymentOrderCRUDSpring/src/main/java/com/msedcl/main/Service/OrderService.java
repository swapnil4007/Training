package com.msedcl.main.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msedcl.main.domain.Order;


//without constructor injection
//@Service
//public class OrderService {
//
//	@Autowired
//	private PaymentService paymentService;
//	
//	@Autowired
//	private CardPaymentService cardPaymentService;
//
//	public void placeOrder(Order order) {
//		System.out.println("Order Placed Successfully");
//		System.out.println("Product Name :"+order.getProdName());
//		System.out.println("Price :"+order.getPrice());
//		cardPaymentService.doPayment();
//	}
//
//}

//with constructor injection

@Service
public class OrderService {

    private CardPaymentService cardPaymentService;

	//private PaymentService paymentService;
	
	public OrderService(CardPaymentService cardPaymentService) {
		this.cardPaymentService = cardPaymentService;
	}

	public void placeOrder(Order order) {
		System.out.println("Order Placed Successfully");
		System.out.println("Product Name :"+order.getProdName());
		System.out.println("Price :"+order.getPrice());
		cardPaymentService.doPayment();
	}

}
