package com.technospace.hotelapp.service;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;

import com.technospace.hotelapp.model.OrderModel;

public interface IOrderService {
	public String addorder(OrderModel orderModel);
	public ArrayList getallorders();
}
