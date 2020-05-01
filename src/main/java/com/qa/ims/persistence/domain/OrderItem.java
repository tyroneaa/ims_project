package com.qa.ims.persistence.domain;

public class OrderItem {
	private int orderItemID;
	private int orderID;
	private int itemID;
	private int quantity;
	public OrderItem(int orderItemID, int orderID, int itemID, int quantity) {
		super();
		this.orderItemID = orderItemID;
		this.orderID = orderID;
		this.itemID = itemID;
		this.quantity = quantity;
	}
	public int getOrderItemID() {
		return orderItemID;
	}
	public void setOrderItemID(int orderItemID) {
		this.orderItemID = orderItemID;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemID;
		result = prime * result + orderID;
		result = prime * result + orderItemID;
		result = prime * result + quantity;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		if (itemID != other.itemID)
			return false;
		if (orderID != other.orderID)
			return false;
		if (orderItemID != other.orderItemID)
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}
	
	
	
	
	

}
