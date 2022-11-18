package com.drone.agriDrone.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
//@Table(name = "dronedetails")
public class DroneDetails {

	private @Id @GeneratedValue(strategy = GenerationType.AUTO) long serviceId;
	@NotBlank(message = "serviceType is mandatory")
	private String serviceType;
	@NotBlank(message = "price is mandatory")
	private double price;
	@NotBlank(message = "equipment is mandatory")
	private String equipment;
	@NotBlank(message = "brand is mandatory")
	private String brand;
	private LocalDate fromDate;
	private LocalDate toDate;
	private boolean paymentMade;
	private String status;
	private String farmerEmail;

	public DroneDetails() {

	}

	/**
	 * @param serviceId
	 * @param serviceType
	 * @param price
	 * @param equipment
	 * @param serviceBrand
	 * @param fromDate
	 * @param toDate
	 * @param paymentMade
	 * @param status
	 */
	public DroneDetails(long serviceId, String serviceType, double price, String equipment, String brand,
			LocalDate fromDate, LocalDate toDate, boolean paymentMade, String status, String farmerEmail) {
		super();
		this.serviceId = serviceId;
		this.serviceType = serviceType;
		this.price = price;
		this.equipment = equipment;
		this.brand = brand;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.paymentMade = paymentMade;
		this.status = status;
		this.farmerEmail = farmerEmail;
	}

	/**
	 * @return the serviceType
	 */
	public String getServiceType() {
		return serviceType;
	}

	/**
	 * @param serviceType the serviceType to set
	 */
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * @return the farmerEmail
	 */
	public String getFarmerEmail() {
		return farmerEmail;
	}

	/**
	 * @param farmerEmail the farmerEmail to set
	 */
	public void setFarmerEmail(String farmerEmail) {
		this.farmerEmail = farmerEmail;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the serviceId
	 */
	public long getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the equipment
	 */
	public String getEquipment() {
		return equipment;
	}

	/**
	 * @param equipment the equipment to set
	 */
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	/**
	 * @return the serviceBrand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param serviceBrand the serviceBrand to set
	 */
	public void setServiceBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the fromDate
	 */
	public LocalDate getFromDate() {
		return fromDate;
	}

	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * @return the toDate
	 */
	public LocalDate getToDate() {
		return toDate;
	}

	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public String getServicetype() {
		return serviceType;
	}

	public void setServicetype(String servicetype) {
		this.serviceType = servicetype;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isPaymentMade() {
		return paymentMade;
	}

	public void setPaymentMade(boolean paymentMade) {
		this.paymentMade = paymentMade;
	}

}
