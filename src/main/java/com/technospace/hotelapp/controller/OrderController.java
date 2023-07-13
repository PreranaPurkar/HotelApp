package com.technospace.hotelapp.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technospace.hotelapp.model.OrderModel;
import com.technospace.hotelapp.service.IOrderService;

@RestController
@RequestMapping("/HotelApp/Order")
public class OrderController {
	@Autowired
	IOrderService iOrderService;
	
	@GetMapping("/home")
		public String home() {
		return "Welcome to Order Site...";
	}
	@PostMapping("/addorder")
	public String addorder(@RequestBody OrderModel orderModel) {
		return iOrderService.addorder(orderModel);
	}
	
	@GetMapping("/getallorders")
	public ArrayList getallorders() {
		return iOrderService.getallorders();
	}
}
