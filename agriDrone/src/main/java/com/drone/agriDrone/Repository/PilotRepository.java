package com.drone.agriDrone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.drone.agriDrone.entity.Pilot;

@Repository
public interface PilotRepository  extends JpaRepository<Pilot, Long>{
	
	Pilot findByEmail(String email);
	
	Pilot findByEmailAndRole(String email, String role);

}
