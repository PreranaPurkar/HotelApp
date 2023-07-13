package com.technospace.hotelapp.service.impl;

import java.util.ArrayList;


import org.springframework.stereotype.Service;

import com.technospace.hotelapp.entity.CustomerEntity;
import com.technospace.hotelapp.model.CustomerModel;
import com.technospace.hotelapp.service.ICustomerService;


@Service
public class CustomerService implements ICustomerService{
	
ArrayList<CustomerEntity> customerList = new ArrayList<>();
	@Override
	public String addcustomer(CustomerModel customerModel) {
		
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setCid(customerModel.getCid());
		customerEntity.setName(customerModel.getName());
		customerEntity.setMobileno(customerModel.getMobileno());
		customerEntity.setEmailid(customerModel.getEmailid());
		
		customerList.add(customerEntity);
		
		return "Customer Added Succesfully...";
	}

	@Override
	public ArrayList getallcustomer() {
		return customerList;
	}


}
