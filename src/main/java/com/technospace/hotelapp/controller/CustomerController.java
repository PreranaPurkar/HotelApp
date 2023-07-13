package com.technospace.hotelapp.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technospace.hotelapp.model.CustomerModel;
import com.technospace.hotelapp.service.ICustomerService;

@RestController
@RequestMapping("/HotelApp/Customer")
public class CustomerController {
	@Autowired
	ICustomerService iCustomerService;
	@GetMapping("/home")
	public String home() {
		return "Welcome to Customer Site...";
	}
	@PostMapping("/addcustomer")
	public String addcustomer(@RequestBody CustomerModel customerModel) {
		return iCustomerService.addcustomer(customerModel) ;
		}
	@GetMapping("/getallcustomer")
	public ArrayList getallcustomer() {
		return iCustomerService.getallcustomer();
	}
}


