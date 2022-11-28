package com.drone.agriDrone.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.drone.agriDrone.response.DroneBookingResponse;

import jakarta.validation.Valid;

@Component
public interface DroneBookingRepo extends JpaRepository<DroneBookingResponse, Long> {

	List<DroneBookingResponse> findByfarmerEmail(String farmerEmail);

	DroneBookingResponse findByBookingId(long bookingId);
	
	//List<DroneBookingResponse> findByBookingID(long bookingId);

	List<DroneBookingResponse> findBypilotEmail(@Valid String pilotEmailID);

}
