package com.qa.ims.persistence.domain;

public class Order {
	private Long orderID;
	private Long customerID;
	
	public Order(Long orderID, Long customerID) {
		super();
		this.orderID = orderID;
		this.customerID = customerID;
	}
	
	
	public Order(Long customerID) {
		super();
		this.customerID = customerID;
	}


	public Long getOrderID() {
		return orderID;
	}
	
	public void setOrderID(Long orderID) {
		this.orderID = orderID;
	}
	
	public Long getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}
	
	@Override
	public String toString() {
		return "OrderID = " + orderID + ", CustomerID = " + customerID;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerID == null) ? 0 : customerID.hashCode());
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
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
		Order other = (Order) obj;
		if (customerID == null) {
			if (other.customerID != null)
				return false;
		} else if (!customerID.equals(other.customerID))
			return false;
		if (orderID == null) {
			if (other.orderID != null)
				return false;
		} else if (!orderID.equals(other.orderID))
			return false;
		return true;
	}
	

}
