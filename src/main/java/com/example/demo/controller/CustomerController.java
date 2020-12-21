package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	 
	 @PostMapping("/customers")
	 public void saveCustomer(Customer customer, @RequestParam("dob") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dob){
		 customerService.save(customer);
	 }
	 
	 @GetMapping("/customers")
	 public List<Customer> getReservations() {
		 return customerService.getAll();
	 }
}
