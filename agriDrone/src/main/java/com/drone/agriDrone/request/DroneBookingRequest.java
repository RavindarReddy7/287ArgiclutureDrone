package com.drone.agriDrone.request;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DroneBookingRequest {
	
	private @Id @GeneratedValue (strategy = GenerationType.AUTO) long bookingID;
	private double price;
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
	private String noOfFlightsEveryDay;
	private String landtype;
	private String farm;
	
	/**
	 * @return the pilotEmail
	 */
	public String getPilotEmail() {
		return pilotEmail;
	}
	/**
	 * @param pilotEmail the pilotEmail to set
	 */
	public void setPilotEmail(String pilotEmail) {
		this.pilotEmail = pilotEmail;
	}
	/**
	 * @param bookingID
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
	 * @param noOfFlightsEveryDay
	 * @param landtype
	 * @param farm
	 */
	public DroneBookingRequest(long bookingID, double price, String equipment, String brand, LocalDate fromDate,
			LocalDate toDate, boolean paymentMade, String status, String farmerEmail, String farmLand,
			String serviceType, String noOfFlightsEveryDay, String landtype, String farm,String pilotEmail) {
		super();
		this.bookingID = bookingID;
		this.price = price;
		this.equipment = equipment;
		this.brand = brand;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.paymentMade = paymentMade;
		this.status = status;
		this.farmerEmail = farmerEmail;
		this.farmLand = farmLand;
		this.serviceType = serviceType;
		this.noOfFlightsEveryDay = noOfFlightsEveryDay;
		this.landtype = landtype;
		this.farm = farm;
		this.pilotEmail=pilotEmail;
	}
	/**
	 * @return the bookingID
	 */
	public long getBookingID() {
		return bookingID;
	}
	/**
	 * @param bookingID the bookingID to set
	 */
	public void setBookingID(long bookingID) {
		this.bookingID = bookingID;
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
	 * @return the noOfFlightsEveryDay
	 */
	public String getNoOfFlightsEveryDay() {
		return noOfFlightsEveryDay;
	}
	/**
	 * @param noOfFlightsEveryDay the noOfFlightsEveryDay to set
	 */
	public void setNoOfFlightsEveryDay(String noOfFlightsEveryDay) {
		this.noOfFlightsEveryDay = noOfFlightsEveryDay;
	}
	/**
	 * @return the landtype
	 */
	public String getLandtype() {
		return landtype;
	}
	/**
	 * @param landtype the landtype to set
	 */
	public void setLandtype(String landtype) {
		this.landtype = landtype;
	}
	/**
	 * @return the farm
	 */
	public String getFarm() {
		return farm;
	}
	/**
	 * @param farm the farm to set
	 */
	public void setFarm(String farm) {
		this.farm = farm;
	}
	

	
}
