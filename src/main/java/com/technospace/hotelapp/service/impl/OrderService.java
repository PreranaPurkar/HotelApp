package com.technospace.hotelapp.service.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.technospace.hotelapp.entity.OrderEntity;
import com.technospace.hotelapp.model.OrderModel;
import com.technospace.hotelapp.service.IOrderService;

@Service
public class OrderService implements IOrderService {

	ArrayList<OrderEntity>orderList = new ArrayList();
	@Override
	public String addorder(OrderModel orderModel) {
		OrderEntity orderEntity = new OrderEntity();
		orderEntity.setOid(orderModel.getOid());
		orderEntity.setCid(orderModel.getCid());
		orderEntity.setDate(orderModel.getDate());
		orderEntity.setAmount(orderModel.getAmount());
		 orderList.add(orderEntity);
		 return "Order Added Successfully..";
	}
		@Override
	public ArrayList getallorders() {
		return orderList;
	}

}
