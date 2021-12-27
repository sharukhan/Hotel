package com.hotel.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hotel.application.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
	
	
	  @Query(value = "SELECT COUNT(room_status) FROM user_details WHERE room_status = 2", nativeQuery = true) 
	  int getVaccantRoom();
	  
	  @Query(value = "SELECT COUNT(room_status) FROM user_details WHERE room_status = 1", nativeQuery = true) 
	  int getOccupiedRoom();
	 
	
	  @Query(value = "SELECT COUNT(room_status) FROM user_details WHERE room_status = 1 OR room_status = 2", nativeQuery = true)
	  int getTotalRoomCount();
	
	
	  @Query (value = "SELECT check_in_time FROM user_details WHERE id = id", nativeQuery = true)
	  String checkInTime(int id);
	  
	  @Query (value = "SELECT check_out_time FROM user_details WHERE id = id", nativeQuery = true)
	  String checkOutTime(int id);
	 

}
