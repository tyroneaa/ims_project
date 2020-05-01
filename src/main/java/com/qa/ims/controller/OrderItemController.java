package com.qa.ims.controller;

import java.util.List;

import org.apache.log4j.Logger;

//import com.qa.ims.persistence.domain.Order;
import com.qa.ims.persistence.domain.OrderItem;
import com.qa.ims.services.CrudServices;
import com.qa.ims.utils.Utils;

public class OrderItemController implements CrudController<OrderItem>{
	public static final Logger LOGGER = Logger.getLogger(OrderItemController.class);
	
	private CrudServices<OrderItem> orderItemService;
	
	public OrderItemController(CrudServices<OrderItem> orderItemService) {
		super();
		this.orderItemService = orderItemService;
	}
	
	String getInput() {
		return Utils.getInput();
	}
	
	Double getDouble() {
		return Utils.getDouble();
	}
	Long getLong() {
		return Utils.getLong();
	}


	@Override
	public List<OrderItem> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderItem create() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderItem update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
	public void total() {
		
	}

}
