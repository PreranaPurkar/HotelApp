package com.technospace.hotelapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HotelApp/Customer")
public class CustomerController {
	@GetMapping("/home")
	
	public String home() {
		return "Welcome to Customer Site";
	}
	@PostMapping
	public Customer addcustomer() {
		return 	}
}
