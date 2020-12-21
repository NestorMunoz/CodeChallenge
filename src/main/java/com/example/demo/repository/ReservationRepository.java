package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Reservation;
import com.example.demo.model.Customer;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Integer>{

	//List<Reservation> find(Integer id);
	
	List<Reservation> findByCustomer(Customer customer);
}
