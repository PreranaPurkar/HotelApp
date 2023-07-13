package com.technospace.hotelapp.service;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;

import com.technospace.hotelapp.model.CustomerModel;

public interface ICustomerService {
	public String addcustomer(CustomerModel customerModel);
	public ArrayList getallcustomer();
}
