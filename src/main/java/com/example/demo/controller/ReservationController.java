package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Reservation;
import com.example.demo.service.ReservationService;

@RestController
public class ReservationController {

	@Autowired
	private ReservationService reservationService;
	 
	 @PostMapping("/reservations")
	 public void saveReservation(Reservation reservation){
		 reservationService.save(reservation);
	 }

	 @GetMapping("/reservations")
	 public List<Reservation> getReservations() {
		 return reservationService.getAll();
	 }
	 
	 @GetMapping("/reservations/{id}")
	 public Reservation getReservation(@PathVariable(name="id")Integer id){
		 return reservationService.get(id);
	 }
	 
	 @DeleteMapping("/reservations/{id}")
	 public void deleteReservation(@PathVariable(name="id")Integer id){
		 reservationService.delete(id);
		 System.out.println("Reservation Deleted Successfully");
	 }
	 
	 @DeleteMapping("/reservations/{ids}")
	 public void deleteReservation(@PathVariable(name="ids")List<Integer> ids){
		 reservationService.deleteList(ids);
		 System.out.println("Reservations Deleted Successfully");
	 }

}
