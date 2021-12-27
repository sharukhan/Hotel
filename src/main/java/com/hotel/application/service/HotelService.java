package com.hotel.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.application.model.UserModel;
import com.hotel.application.repository.UserRepository;

@Service
public class HotelService {
	
	@Autowired
	UserRepository userRepo;
	
	public UserModel bookRoom(UserModel userModel) {
		return userRepo.save(userModel);
	}
	
	
	 public int getVaccantRoom() { 
		 return userRepo.getVaccantRoom(); 
		 }
	 
	 public int getOccupiedRoom() { 
		 return userRepo.getOccupiedRoom(); 
		 }
	
	
	public int getTotalRoomCount() {
		return userRepo.getTotalRoomCount();
	}
	
	
	 public String getcheckIn(int id) { 
		 return userRepo.checkInTime(id);
				 }
	 
	 public String getCheckOut(int id) { 
		 return userRepo.checkOutTime(id);
				 }
	

}
