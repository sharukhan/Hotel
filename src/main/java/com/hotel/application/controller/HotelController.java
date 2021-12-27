package com.hotel.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.application.model.UserModel;
import com.hotel.application.service.HotelService;

@RestController
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	@PostMapping("/hotelBooking")
	public UserModel addBooking(@RequestBody UserModel userModel) {
		return hotelService.bookRoom(userModel);
	}
	
	@GetMapping("/showAllRooms")
	public int getAllRooms() {
		return hotelService.getTotalRoomCount();
	}	
	
	 @GetMapping("/showVacantRooms") 
	 public int getVacantRooms() { 
		 return	 hotelService.getVaccantRoom(); 
		 }
	 
	 @GetMapping("/showOccupiedRooms") 
	 public int getOccupiedRooms() { 
		 return	 hotelService.getOccupiedRoom(); 
		 }
	 
	 @GetMapping("/checkIn")
	 public String checkInTime(@PathVariable int id) {
		 return hotelService.getcheckIn(id);
	 }
	 
	 @GetMapping("/checkOut")
	 public String checkOutTime(@PathVariable int id) {
		 return hotelService.getCheckOut(id);
	 }
	

}
