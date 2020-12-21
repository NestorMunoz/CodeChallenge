package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.model.Reservation;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	public void save(Customer customer){
		customerRepository.save(customer);
	}
	
	public List<Customer> getAll() {
		return (List<Customer>) customerRepository.findAll();
	}
}
