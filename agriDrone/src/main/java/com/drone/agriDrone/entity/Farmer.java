package com.drone.agriDrone.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name ="Farmer")
public class Farmer {

	private @Id @GeneratedValue (strategy = GenerationType.AUTO)
	long id;
	private String name;
	@Column(unique = true)
	@Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}", flags = Pattern.Flag.CASE_INSENSITIVE)
	private String email;
	@NotBlank(message = "password is mandatory")
	private String password;
	private String gender;
	private LocalDate dateOfBirth;
	private String address;
	private String driver_license;
	private String farm_utility;
	private String payment_method;
	private String payment_details;
	private long phoneNUmber;
	@NotBlank(message = "role is mandatory")
	private String role;
	private String streetno;
	private String unit_no;
	private String city;
	private String state;
	private int zipcode;
	//image of license
	
	/**
	 * @return the streetno
	 */
	public String getStreetno() {
		return streetno;
	}
	/**
	 * @param streetno the streetno to set
	 */
	public void setStreetno(String streetno) {
		this.streetno = streetno;
	}
	/**
	 * @return the unit_no
	 */
	public String getUnit_no() {
		return unit_no;
	}
	/**
	 * @param unit_no the unit_no to set
	 */
	public void setUnit_no(String unit_no) {
		this.unit_no = unit_no;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the zipcode
	 */
	public int getZipcode() {
		return zipcode;
	}
	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	/*
	 * public Address getAddress() { return address; } public void
	 * setAddress(Address address) { this.address = address; }
	 */
	public String getDriver_license() {
		return driver_license;
	}
	public void setDriver_license(String driver_license) {
		this.driver_license = driver_license;
	}
	public String getFarm_utility() {
		return farm_utility;
	}
	public void setFarm_utility(String farm_utility) {
		this.farm_utility = farm_utility;
	}
	public String getPayment_method() {
		return payment_method;
	}
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}
	public String getPayment_details() {
		return payment_details;
	}
	public void setPayment_details(String payment_details) {
		this.payment_details = payment_details;
	}
	public Farmer() {
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public long getPhoneNUmber() {
		return phoneNUmber;
	}
	public void setPhoneNUmber(long phoneNUmber) {
		this.phoneNUmber = phoneNUmber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param password
	 * @param gender
	 * @param dateOfBirth
	 * @param address
	 * @param driver_license
	 * @param farm_utility
	 * @param payment_method
	 * @param payment_details
	 * @param phoneNUmber
	 * @param role
	 * @param streetno
	 * @param unit_no
	 * @param city
	 * @param state
	 * @param zipcode
	 */
	public Farmer(long id, String name, String email, String password, String gender, LocalDate dateOfBirth,
			String address, String driver_license, String farm_utility, String payment_method, String payment_details,
			long phoneNUmber, String role, String streetno, String unit_no, String city, String state, int zipcode) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.driver_license = driver_license;
		this.farm_utility = farm_utility;
		this.payment_method = payment_method;
		this.payment_details = payment_details;
		this.phoneNUmber = phoneNUmber;
		this.role = role;
		this.streetno = streetno;
		this.unit_no = unit_no;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
}
