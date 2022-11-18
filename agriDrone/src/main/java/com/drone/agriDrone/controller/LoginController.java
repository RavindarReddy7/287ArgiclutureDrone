package com.drone.agriDrone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.drone.agriDrone.Repository.FarmerRepository;
import com.drone.agriDrone.Repository.PilotRepository;
import com.drone.agriDrone.Service.FarmerService;
import com.drone.agriDrone.Service.PilotService;
import com.drone.agriDrone.entity.Farmer;
import com.drone.agriDrone.entity.Pilot;
import com.drone.agriDrone.entity.UserProfile;
import com.drone.agriDrone.exception.DroneBusinessException;
import com.drone.agriDrone.request.LoginRequest;
import com.drone.agriDrone.response.DroneBookingResponseBuilder;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/auth")
public class LoginController {

	@Autowired
	FarmerService farmerService;

	@Autowired
	PilotService pilotService;

	@Autowired
	FarmerRepository farmerRepository;

	@Autowired
	PilotRepository pilotRepository;
	
	@Autowired
	DroneBookingResponseBuilder droneBookingResponseBuilder;

	/**
	 * @param farmerService
	 * @param pilotService
	 * @param farmerRepository
	 * @param polPilotRepository
	 */
	public LoginController(FarmerService farmerService, PilotService pilotService, FarmerRepository farmerRepository,
			PilotRepository polPilotRepository,DroneBookingResponseBuilder droneBookingResponseBuilder) {
		this.farmerService = farmerService;
		this.pilotService = pilotService;
		this.farmerRepository = farmerRepository;
		this.pilotRepository = polPilotRepository;
		this.droneBookingResponseBuilder=droneBookingResponseBuilder;
	}

	@PostMapping("/signup")
	public String userSignUp(@NotNull @Valid @RequestBody UserProfile userProfile) {

		if (userProfile.getRole().equalsIgnoreCase("farmer")) {

			farmerService.saveFarmerDetails(userProfile);

		} else if (userProfile.getRole().equalsIgnoreCase("pilot")) {

			pilotService.savePilotDetails(userProfile);

		} else {
			throw new DroneBusinessException("please select correct role");
		}
		return "user signup successfull";
	}

	@PostMapping("/pilotSignIn")
	public boolean pilotSignIn(@NotNull @Valid @RequestBody LoginRequest loginRequest) {

		Pilot pilot = pilotRepository.findByEmail(loginRequest.getEmail());

		if (pilot != null && pilot.getPassword().equalsIgnoreCase(loginRequest.getPassword()))

			return true;
		else
			throw new DroneBusinessException("email or password doesn't match");
	}

	@PostMapping("/farmerSignIn")
	public boolean farmerSignIn(@NotNull @Valid @RequestBody LoginRequest loginRequest) {

		Farmer farmer = farmerRepository.findByEmail(loginRequest.getEmail());

		if (farmer != null && farmer.getPassword().equalsIgnoreCase(loginRequest.getPassword()))

			return true;
		else
			throw new DroneBusinessException("email or password doesn't match");
	}

	@GetMapping("/getUserDetails/{emailId}")
	public UserProfile getUserDetails(@NotNull @Valid @PathVariable String emailId, @NotNull @Valid @RequestParam String role) {

		if (role.equalsIgnoreCase("farmer")) {
			
			UserProfile userProfile =  droneBookingResponseBuilder.buildFarmerUserProfileFarmerDetails(emailId,role);
			
			if(userProfile!=null) {
				return userProfile;
				
			}else {
				throw new DroneBusinessException("email doesn't exist");
			}
			
		} else if (role.equalsIgnoreCase("pilot")) {

			UserProfile userProfile =  droneBookingResponseBuilder.buildPilotUserProfileFarmerDetails(emailId,role);
			
			if(userProfile!=null) {
				return userProfile;
				
			}else {
				throw new DroneBusinessException("email doesn't exist");
			}

		} else {

		throw new DroneBusinessException("please select correct role");
		}

	}

}
