package com.capgemini.order.entity;

public class Order {

	private int orderId;
	private int orderQuantity;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, int orderQuantity) {
		super();
		this.orderId = orderId;
		this.orderQuantity = orderQuantity;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderQuantity=" + orderQuantity + "]";
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

}
