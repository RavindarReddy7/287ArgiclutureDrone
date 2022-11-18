package com.drone.agriDrone.response;

import java.time.LocalDate;

import org.hibernate.annotations.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "DroneBookingDetails")
public class DroneBookingResponse {
	
	private @Id @GeneratedValue long bookingId;
	private double droneBaseCost;
	private int serviceDuration;
	private double equipmentCost;
	private double shippingCost;
	private double pilotCharge;
	private double totalPrice;
	private String pilotName;
	private String pilotLicense;
	private String phoneNumber;
	private String equipment;
	private String brand;
	private LocalDate fromDate;
	private LocalDate toDate;
	private boolean paymentMade;
	private String status;
	private String farmerEmail;
	private String farmLand;
	private String serviceType;
	private String pilotEmail;
	

	public DroneBookingResponse() {
	}

	
	/**
	 * @param bookingId
	 * @param droneBaseCost
	 * @param serviceDuration
	 * @param equipmentCost
	 * @param shippingCost
	 * @param pilotCharge
	 * @param totalPrice
	 * @param pilotName
	 * @param pilotLicense
	 * @param phoneNumber
	 * @param emailID
	 * @param price
	 * @param equipment
	 * @param brand
	 * @param fromDate
	 * @param toDate
	 * @param paymentMade
	 * @param status
	 * @param farmerEmail
	 * @param farmLand
	 * @param serviceType
	 * @param pilotEmail
	 */
	public DroneBookingResponse(long bookingId, double droneBaseCost, int serviceDuration, double equipmentCost,
			double shippingCost, double pilotCharge, double totalPrice, String pilotName, String pilotLicense,
			String phoneNumber, String equipment, String brand, LocalDate fromDate,
			LocalDate toDate, boolean paymentMade, String status, String farmerEmail, String farmLand,
			String serviceType,String pilotEmail) {
		super();
		this.bookingId = bookingId;
		this.droneBaseCost = droneBaseCost;
		this.serviceDuration = serviceDuration;
		this.equipmentCost = equipmentCost;
		this.shippingCost = shippingCost;
		this.pilotCharge = pilotCharge;
		this.totalPrice = totalPrice;
		this.pilotName = pilotName;
		this.pilotLicense = pilotLicense;
		this.phoneNumber = phoneNumber;
		this.equipment = equipment;
		this.brand = brand;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.paymentMade = paymentMade;
		this.status = status;
		this.farmerEmail = farmerEmail;
		this.farmLand = farmLand;
		this.serviceType = serviceType;
		this.pilotEmail = pilotEmail;
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
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
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

	/**
	 * @return the paymentMade
	 */
	public boolean isPaymentMade() {
		return paymentMade;
	}

	/**
	 * @param paymentMade the paymentMade to set
	 */
	public void setPaymentMade(boolean paymentMade) {
		this.paymentMade = paymentMade;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
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
	 * @return the farmLand
	 */
	public String getFarmLand() {
		return farmLand;
	}

	/**
	 * @param farmLand the farmLand to set
	 */
	public void setFarmLand(String farmLand) {
		this.farmLand = farmLand;
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
	 * @return the bookingId
	 */
	public long getBookingId() {
		return bookingId;
	}

	/**
	 * @param bookingId the bookingId to set
	 */
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	/**
	 * @return the pilotLicense
	 */
	public String getPilotLicense() {
		return pilotLicense;
	}

	/**
	 * @param pilotLicense the pilotLicense to set
	 */
	public void setPilotLicense(String pilotLicense) {
		this.pilotLicense = pilotLicense;
	}

	/**
	 * @return the droneBaseCost
	 */
	public double getDroneBaseCost() {
		return droneBaseCost;
	}

	/**
	 * @param droneBaseCost the droneBaseCost to set
	 */
	public void setDroneBaseCost(double droneBaseCost) {
		this.droneBaseCost = droneBaseCost;
	}

	/**
	 * @return the serviceDuration
	 */
	public int getServiceDuration() {
		return serviceDuration;
	}

	/**
	 * @param p the serviceDuration to set
	 */
	public void setServiceDuration(int serviceDuration) {
		this.serviceDuration = serviceDuration;
	}

	/**
	 * @return the equipmentCost
	 */
	public double getEquipmentCost() {
		return equipmentCost;
	}

	/**
	 * @param equipmentCost the equipmentCost to set
	 */
	public void setEquipmentCost(double equipmentCost) {
		this.equipmentCost = equipmentCost;
	}

	/**
	 * @return the shippingCost
	 */
	public double getShippingCost() {
		return shippingCost;
	}

	/**
	 * @param shippingCost the shippingCost to set
	 */
	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}

	/**
	 * @return the pilotCharge
	 */
	public double getPilotCharge() {
		return pilotCharge;
	}

	/**
	 * @param pilotCharge the pilotCharge to set
	 */
	public void setPilotCharge(double pilotCharge) {
		this.pilotCharge = pilotCharge;
	}

	/**
	 * @return the totalPrice
	 */
	public double getTotalPrice() {
		return totalPrice;
	}

	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * @return the pilotName
	 */
	public String getPilotName() {
		return pilotName;
	}

	/**
	 * @param pilotName the pilotName to set
	 */
	public void setPilotName(String pilotName) {
		this.pilotName = pilotName;
	}

	/**
	 * @return the license
	 */
	public String getLicense() {
		return pilotLicense;
	}

	/**
	 * @param license the license to set
	 */
	public void setLicense(String pilotLicense) {
		this.pilotLicense = pilotLicense;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getPilotEmail() {
		return pilotEmail;
	}


	public void setPilotEmail(String pilotEmail) {
		this.pilotEmail = pilotEmail;
	}

}
