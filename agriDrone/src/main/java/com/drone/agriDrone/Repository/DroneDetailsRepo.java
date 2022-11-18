package com.drone.agriDrone.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.drone.agriDrone.entity.DroneDetails;
import com.drone.agriDrone.request.DroneBookingRequest;

@Repository
public interface DroneDetailsRepo extends JpaRepository<DroneBookingRequest, Long> {

	List<DroneDetails> findByServiceTypeAndPriceAndEquipmentAndBrandAndStatus(String servicetype, double price,
			String equipment, String brand, String status);

}
