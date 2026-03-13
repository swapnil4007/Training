package com.msedcl.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.msedcl.main.Service.OrderService;
import com.msedcl.main.Service.PaymentService;
import com.msedcl.main.domain.Order;

public class OrderMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.msedcl.main");
		OrderService orderService  = applicationContext.getBean(OrderService.class);
		Order order = new Order(1,"Laptop",50000);
		orderService.placeOrder(order);
		
	}

}
