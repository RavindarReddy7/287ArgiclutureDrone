package com.drone.agriDrone.response;

import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.drone.agriDrone.Repository.DroneBookingRepo;
import com.drone.agriDrone.Repository.FarmerRepository;
import com.drone.agriDrone.Repository.PilotRepository;
import com.drone.agriDrone.entity.Farmer;
import com.drone.agriDrone.entity.Pilot;
import com.drone.agriDrone.entity.UserProfile;
import com.drone.agriDrone.request.DroneBookingRequest;

import jakarta.validation.Valid;

@Component
public class DroneBookingResponseBuilder {

	@Autowired
	DroneBookingRepo droneBookingRepo;
	
	@Autowired
	FarmerRepository farmerRepository;
	
	@Autowired
	PilotRepository pilotRepository;

	public DroneBookingResponseBuilder(DroneBookingRepo droneBookingRepo, FarmerRepository farmerRepository,
			PilotRepository pilotRepository) {
		this.droneBookingRepo = droneBookingRepo;
		this.farmerRepository = farmerRepository;
		this.pilotRepository = pilotRepository;
	}

	public DroneBookingResponse buildResponse(DroneBookingRequest droneBookingRequest) {

		DroneBookingResponse droneBookingResponse = new DroneBookingResponse();

		droneBookingResponse.setDroneBaseCost(droneBookingRequest.getPrice());

		droneBookingResponse.setEquipmentCost(10.0);
		droneBookingResponse.setLicense("FAED1298D");
		droneBookingResponse.setPhoneNumber("987654321");
		droneBookingResponse.setPilotCharge(20.0);
		droneBookingResponse.setShippingCost(10.0);
		
		Random rand = new Random();
		
		List<Pilot> pilotList = pilotRepository.findAll();
		
		/*
		 * List<String> givenList = Arrays.asList("one", "two", "three", "four");
		 * 
		 * int numberOfElements = 2;
		 */

	   // for (int i = 0; i < numberOfElements; i++) {
	        int randomIndex = rand.nextInt(pilotList.size());
	        Pilot randomElement = pilotList.get(randomIndex);
	    //}
	    
	        //System.out.println(randomElement.getName());
	        
	    droneBookingResponse.setPilotName(randomElement.getName());
		droneBookingResponse.setPilotEmail(randomElement.getEmail());
		droneBookingResponse.setFarmerEmail(droneBookingRequest.getFarmerEmail());
		droneBookingResponse.setFarmLand(droneBookingRequest.getFarmLand());
		droneBookingResponse.setServiceType(droneBookingRequest.getServiceType());
		droneBookingResponse.setStatus(droneBookingRequest.getStatus());
		droneBookingResponse.setFromDate(droneBookingRequest.getFromDate());
		droneBookingResponse.setToDate(droneBookingRequest.getToDate());
		droneBookingResponse.setStatus(droneBookingRequest.getStatus());
		droneBookingResponse.setEquipment(droneBookingRequest.getEquipment());
		droneBookingResponse.setBrand(droneBookingRequest.getBrand());

		droneBookingResponse.setServiceDuration(
				Period.between(droneBookingRequest.getFromDate(), droneBookingRequest.getToDate()).getDays());

		droneBookingResponse
				.setTotalPrice((droneBookingResponse.getDroneBaseCost() + droneBookingResponse.getEquipmentCost()
						+ droneBookingResponse.getPilotCharge() + droneBookingResponse.getShippingCost())
						* droneBookingResponse.getServiceDuration());

		return droneBookingResponse;
	}

	public OverViewDetailsResponse buildOverViewDetailsResponse(String farmerEmail) {

		List<DroneBookingResponse> existingdroneBooking = droneBookingRepo.findByfarmerEmail(farmerEmail);
		OverViewDetailsResponse overViewDetailsResponse = new OverViewDetailsResponse();

		overViewDetailsResponse.setActiveBookings(2);
		overViewDetailsResponse.setCompletedBookings(10);
		// overViewDetailsResponse.setLastCompletedBooking(1);
		overViewDetailsResponse.setTotalBookings(existingdroneBooking.size());
		// overViewDetailsResponse.setUpComingBookings(3);
		return overViewDetailsResponse;
	}

	public List<DroneBookingResponse> buildFarmerBookingsResponse(@Valid String emailID) {

		List<DroneBookingResponse> listOfBookings = droneBookingRepo.findByfarmerEmail(emailID);

		return listOfBookings;
	}

	public DroneBookingResponse buildBookingByID(@Valid long bookingId) {

		DroneBookingResponse listOfBookings = droneBookingRepo.findByBookingId(bookingId);

		return listOfBookings;
	}

	public List<DroneBookingResponse> buildPilotBookingsResponse(@Valid String pilotEmailID) {

		List<DroneBookingResponse> listOfBookings = droneBookingRepo.findBypilotEmail(pilotEmailID);

		return listOfBookings;
	}

	public UserProfile buildFarmerUserProfileFarmerDetails(@Valid String emailId, @Valid String role) {

		Farmer farmer = farmerRepository.findByEmailAndRole(emailId, role);

		UserProfile userProfile = null ;
		
		if (farmer != null) {
			userProfile= new UserProfile();

			userProfile.setEmail(farmer.getEmail());
			userProfile.setDate_of_birth(farmer.getDateOfBirth());
			userProfile.setGender(farmer.getGender());
			userProfile.setPassword(farmer.getPassword());
			userProfile.setUsername(farmer.getName());
			userProfile.setPayment_details(farmer.getPayment_details());
			userProfile.setPayment_method(farmer.getPayment_method());
			userProfile.setPhone_number(farmer.getPhoneNUmber());
			userProfile.setCity(farmer.getCity());
			userProfile.setAddress(farmer.getAddress());
			userProfile.setDriver_license(farmer.getDriver_license());
			userProfile.setRole(farmer.getRole());
			userProfile.setState(farmer.getState());
			userProfile.setFarm_utility(farmer.getFarm_utility());
			userProfile.setStreetno(farmer.getStreetno());
			userProfile.setUnit_no(farmer.getUnit_no());
			userProfile.setZipcode(farmer.getZipcode());
		}

		return userProfile;

	}

	public UserProfile buildPilotUserProfileFarmerDetails(@Valid String emailId, @Valid String role) {

		Pilot pilot = pilotRepository.findByEmailAndRole(emailId, role);

		UserProfile userProfile =null ;
		if (pilot != null) {
			
			userProfile= new UserProfile();

		userProfile.setEmail(pilot.getEmail());
		userProfile.setDate_of_birth(pilot.getDate_of_birth());
		userProfile.setGender(pilot.getGender());
		userProfile.setPassword(pilot.getPassword());
		userProfile.setUsername(pilot.getName());
		userProfile.setPhone_number(pilot.getPhone_number());
		userProfile.setCity(pilot.getCity());
		userProfile.setAddress(pilot.getAddress());
		userProfile.setDriver_license(pilot.getPilot_license());
		userProfile.setRole(pilot.getRole());
		userProfile.setState(pilot.getState());
		userProfile.setStreetno(pilot.getStreetno());
		userProfile.setUnit_no(pilot.getUnit_no());
		userProfile.setZipcode(pilot.getZipcode());
		}

		return userProfile;
	}

}
