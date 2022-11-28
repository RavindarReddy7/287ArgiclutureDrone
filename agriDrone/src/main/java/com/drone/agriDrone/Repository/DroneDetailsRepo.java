package com.drone.agriDrone.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.drone.agriDrone.entity.DroneDetails;

@Repository
public interface DroneDetailsRepo extends JpaRepository<DroneDetails, Long> {

	
	//@Query("SELECT * FROM drone_details  WHERE service_type =  t.level >= ?1")
	List<DroneDetails> findByServiceTypeAndPriceAndEquipmentAndBrandAndStatus(String servicetype, double price,
			String equipment, String brand, String status);

}
