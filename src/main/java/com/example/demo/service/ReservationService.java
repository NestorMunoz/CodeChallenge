package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Customer;
import com.example.demo.model.Reservation;

public interface ReservationService {
	
	public void save(Reservation reservation);
	
	public Reservation get(Integer id);
	
	public List<Reservation> getAll();
	 
	public void delete(Integer id);
	 
	public void deleteList(List<Integer> ids);
	
	public List<Reservation> getAllByCustomer(Customer customer);

}
