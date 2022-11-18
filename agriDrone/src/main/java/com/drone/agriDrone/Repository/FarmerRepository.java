package com.drone.agriDrone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.drone.agriDrone.entity.Farmer;

@Repository
public interface FarmerRepository extends JpaRepository<Farmer, Long> {
	
	Farmer findByEmail(String email);
	
	Farmer findByEmailAndRole(String email, String role);
	

}
