package com.drone.agriDrone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.drone.agriDrone.Repository.DroneBookingRepo;
import com.drone.agriDrone.Repository.DroneDetailsRepo;
import com.drone.agriDrone.entity.DroneDetails;
import com.drone.agriDrone.request.DroneBookingRequest;
import com.drone.agriDrone.response.DroneBookingResponse;
import com.drone.agriDrone.response.DroneBookingResponseBuilder;
import com.drone.agriDrone.response.OverViewDetailsResponse;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
@RequestMapping("/agriDrone")
public class DroneBookingController {

	@Autowired
	DroneDetailsRepo droneDetailsRepo;
	
	@Autowired
	DroneBookingRepo droneBookingRepo;

	@Autowired
	DroneBookingResponseBuilder droneBookingResponseBuilder;

	/**
	 * @param droneDetailsRepo
	 * @param droneBookingRepo
	 * @param droneBookingResponseBuilder
	 */
	public DroneBookingController(DroneDetailsRepo droneDetailsRepo,
			DroneBookingRepo droneBookingRepo,
			DroneBookingResponseBuilder droneBookingResponseBuilder) {
		this.droneDetailsRepo = droneDetailsRepo;
		this.droneBookingRepo=droneBookingRepo;
		this.droneBookingResponseBuilder = droneBookingResponseBuilder;
	}

	@GetMapping("/getDroneDetails/queryparams")
	public ResponseEntity<List<DroneDetails>> selectDrone(@RequestParam String serviceType, @RequestParam double price,
			@RequestParam String equipment, @RequestParam String brand, @RequestParam String status) {

		return new ResponseEntity<List<DroneDetails>>(droneDetailsRepo
				.findByServiceTypeAndPriceAndEquipmentAndBrandAndStatus(serviceType, price, equipment, brand, status),
				HttpStatus.OK);
	}
	/*
	 * @GetMapping("/getDroneDetails") public ResponseEntity<List<DroneDetails>>
	 * getAllDrone() {
	 * 
	 * return new ResponseEntity<List<DroneDetails>>(droneDetailsRepo.findAll(),
	 * HttpStatus.OK); }
	 */
	@PostMapping("/saveDroneDetails")
	public String saveDroneDetails(@NotNull @Valid @RequestBody DroneBookingRequest droneBookingRequest) {

		droneDetailsRepo.save(droneBookingRequest);

		return "details saved succesfully";
	}

	@PostMapping("/bookDrone")
	public ResponseEntity<DroneBookingResponse> bookDrone(@NotNull @Valid @RequestBody DroneBookingRequest droneBookingRequest) {
		/*
		 * List<DroneDetails> droneDetailsResponse = droneBookingRepo
		 * .findByServiceTypeAndPriceAndEquipmentAndBrandAndStatus(droneDetailsrequest.
		 * getServicetype(), droneDetailsrequest.getPrice(),
		 * droneDetailsrequest.getEquipment(), droneDetailsrequest.getBrand(),
		 * droneDetailsrequest.getStatus());
		 */
		DroneBookingResponse droneBookingResponse = droneBookingResponseBuilder.buildResponse(droneBookingRequest);
		
		droneBookingRepo.save(droneBookingResponse);

		return new ResponseEntity<DroneBookingResponse>(droneBookingResponse, HttpStatus.OK);
	}
	
	@GetMapping("/getOverViewDetails/{emailID}")
	public ResponseEntity<OverViewDetailsResponse> getOverviewDetails(@NotNull @Valid @PathVariable String emailID){
		
		OverViewDetailsResponse overViewDetailsResponse = droneBookingResponseBuilder.buildOverViewDetailsResponse(emailID);
		
		return new ResponseEntity<OverViewDetailsResponse>(overViewDetailsResponse, HttpStatus.OK);
	}
	
	@GetMapping("/getAllFarmerBookings/{emailID}")
	public ResponseEntity<List<DroneBookingResponse>> getAllFarmerBookings(@NotNull @Valid @PathVariable String emailID){
		
		List<DroneBookingResponse> droneBookingResponse = droneBookingResponseBuilder.buildFarmerBookingsResponse(emailID);
		
		return new ResponseEntity<List<DroneBookingResponse>>(droneBookingResponse, HttpStatus.OK);
	}
	
	@GetMapping("/getBooking/{bookingId}")
	public ResponseEntity<List<DroneBookingResponse>> getBookingByID(@NotNull @Valid @PathVariable long bookingId){
		
		List<DroneBookingResponse> droneBookingResponse = droneBookingResponseBuilder.buildBookingByID(bookingId);
		
		return new ResponseEntity<List<DroneBookingResponse>>(droneBookingResponse, HttpStatus.OK);
	}

	@GetMapping("/getAllPilotBookings/{pilotEmail}")
	public ResponseEntity<List<DroneBookingResponse>> getAllpilotBookings(@NotNull @Valid @PathVariable String pilotEmail){
		
		List<DroneBookingResponse> droneBookingResponse = droneBookingResponseBuilder.buildPilotBookingsResponse(pilotEmail);
		
		return new ResponseEntity<List<DroneBookingResponse>>(droneBookingResponse, HttpStatus.OK);
	}
	

}
