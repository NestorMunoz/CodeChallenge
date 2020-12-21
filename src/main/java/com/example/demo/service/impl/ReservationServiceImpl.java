package com.example.demo.service.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.model.Reservation;
import com.example.demo.repository.ReservationRepository;
import com.example.demo.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private ReservationRepository reservationRepository;

	public void save(Reservation reservation){
		reservationRepository.save(reservation);
	}
	
	public Reservation get(Integer id){
		return reservationRepository.findById(id).get();
	}
	 
	public List<Reservation> getAll() {
		return (List<Reservation>) reservationRepository.findAll();
	}
	
	 
	public void delete(Integer id){
		reservationRepository.deleteById(id);
	}
	
	public void deleteList(List<Integer> ids){
		ids.stream().forEach((id) -> reservationRepository.deleteById(id));
	}

	public List<Reservation> getAllByCustomer(Customer customer) {
		return (List<Reservation>) reservationRepository.findByCustomer(customer);
	}

}
