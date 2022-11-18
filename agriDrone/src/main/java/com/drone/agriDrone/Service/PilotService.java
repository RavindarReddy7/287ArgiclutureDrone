package com.drone.agriDrone.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drone.agriDrone.Repository.PilotRepository;
import com.drone.agriDrone.entity.Pilot;
import com.drone.agriDrone.entity.UserProfile;

@Service
public class PilotService {
	

	@Autowired
	PilotRepository pilotRepository;
	
	
	/**
	 * @param pilotRepository
	 */
	public PilotService(PilotRepository pilotRepository) {
		this.pilotRepository = pilotRepository;
	}


	public String savePilotDetails(UserProfile userProfile) {
		
		Pilot pilot = new Pilot();
		
		pilot.setName(userProfile.getUsername());
		pilot.setEmail(userProfile.getEmail());
		pilot.setPassword(userProfile.getPassword());
		pilot.setGender(userProfile.getGender());
		pilot.setLicense_details(userProfile.getPilot_license());
		pilot.setDate_of_birth(userProfile.getDate_of_birth());
		pilot.setRole(userProfile.getRole());
		pilot.setPhone_number(userProfile.getPhone_number());
		
		pilot.setAddress(userProfile.getAddress());
		pilot.setCity(userProfile.getCity());
		pilot.setStreetno(userProfile.getStreetno());
		pilot.setUnit_no(userProfile.getUnit_no());
		pilot.setZipcode(userProfile.getZipcode());
		pilot.setState(userProfile.getState());
		
		
		pilotRepository.save(pilot);
		
		return "saved";
	}
	

}
