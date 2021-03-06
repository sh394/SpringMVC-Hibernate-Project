package com.springdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springdemo.entity.Customer;

@Service
public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
}
