package com.msedcl.main.domain;

import org.springframework.stereotype.Component;


public class Order {
	private int orderId;
	private String prodName;
	private int price;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, String prodName, int price) {
		super();
		this.orderId = orderId;
		this.prodName = prodName;
		this.price = price;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", prodName=" + prodName + ", price=" + price + "]";
	}

	
	
	
	

}
