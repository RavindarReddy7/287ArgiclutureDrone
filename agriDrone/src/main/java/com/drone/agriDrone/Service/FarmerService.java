package com.drone.agriDrone.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drone.agriDrone.Repository.FarmerRepository;
import com.drone.agriDrone.entity.Farmer;
import com.drone.agriDrone.entity.UserProfile;

@Service
public class FarmerService {

	@Autowired
	FarmerRepository farmerRepository;
	
	/**
	 * @param farmerRepository
	 */
	public FarmerService(FarmerRepository farmerRepository) {
		this.farmerRepository = farmerRepository;
	}

	public String saveFarmerDetails(UserProfile userProfile) {
		
		
		Farmer farmer = new Farmer();
		
		farmer.setName(userProfile.getUsername());
		farmer.setEmail(userProfile.getEmail());
		farmer.setPassword(userProfile.getPassword());
		farmer.setDriver_license(userProfile.getDriver_license());
		farmer.setFarm_utility(userProfile.getFarm_utility());
		farmer.setGender(userProfile.getGender());
		farmer.setRole(userProfile.getRole());
		farmer.setPayment_details(userProfile.getPayment_details());
		farmer.setPayment_method(userProfile.getPayment_method());
		farmer.setAddress(userProfile.getAddress());
		farmer.setCity(userProfile.getCity());
		farmer.setDateOfBirth(userProfile.getDate_of_birth());
		farmer.setPhoneNUmber(userProfile.getPhone_number());
		farmer.setStreetno(userProfile.getStreetno());
		farmer.setUnit_no(userProfile.getUnit_no());
		farmer.setZipcode(userProfile.getZipcode());
		farmer.setState(userProfile.getState());
		farmer.setDateOfBirth(userProfile.getDate_of_birth());
		
		farmerRepository.save(farmer);
		
		return "saved";
		
	}
	
	
	
}
