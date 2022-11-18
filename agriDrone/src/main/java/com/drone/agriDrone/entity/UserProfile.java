package com.drone.agriDrone.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class UserProfile {

	private @Id @GeneratedValue (strategy = GenerationType.AUTO)
	long UserId;
	@NotBlank(message = "username is mandatory")
	private  String username;
	@NotBlank(message = "password is mandatory")
    private  String password;
	@NotBlank(message = "role is mandatory")
    private  String role;
    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}", flags = Pattern.Flag.CASE_INSENSITIVE)
	@Column(unique = true)
	private  String email;
	private String gender;
	private String address;
	private String driver_license;
	private String farm_utility;
	private String payment_method;
	private String payment_details;
	private String pilot_license;
	private LocalDate date_of_birth;
	private Long phone_number;
	private String streetno;
	private String unit_no;
	private String city;
	private String state;
	private int zipcode;


	/**
	 * @return the userId
	 */
	public long getUserId() {
		return UserId;
	}


	/**
	 * @param userId the userId to set
	 */
	public void setUserId(long userId) {
		UserId = userId;
	}


	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}


	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}


	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}


	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * @return the driver_license
	 */
	public String getDriver_license() {
		return driver_license;
	}


	/**
	 * @param driver_license the driver_license to set
	 */
	public void setDriver_license(String driver_license) {
		this.driver_license = driver_license;
	}


	/**
	 * @return the farm_utility
	 */
	public String getFarm_utility() {
		return farm_utility;
	}


	/**
	 * @param farm_utility the farm_utility to set
	 */
	public void setFarm_utility(String farm_utility) {
		this.farm_utility = farm_utility;
	}


	/**
	 * @return the payment_method
	 */
	public String getPayment_method() {
		return payment_method;
	}


	/**
	 * @param payment_method the payment_method to set
	 */
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}


	/**
	 * @return the payment_details
	 */
	public String getPayment_details() {
		return payment_details;
	}


	/**
	 * @param payment_details the payment_details to set
	 */
	public void setPayment_details(String payment_details) {
		this.payment_details = payment_details;
	}


	/**
	 * @return the pilot_license
	 */
	public String getPilot_license() {
		return pilot_license;
	}


	/**
	 * @param pilot_license the pilot_license to set
	 */
	public void setPilot_license(String pilot_license) {
		this.pilot_license = pilot_license;
	}


	/**
	 * @return the date_of_birth
	 */
	public LocalDate getDate_of_birth() {
		return date_of_birth;
	}


	/**
	 * @param date_of_birth the date_of_birth to set
	 */
	public void setDate_of_birth(LocalDate date_of_birth) {
		this.date_of_birth = date_of_birth;
	}


	/**
	 * @return the phone_number
	 */
	public Long getPhone_number() {
		return phone_number;
	}


	/**
	 * @param phone_number the phone_number to set
	 */
	public void setPhone_number(Long phone_number) {
		this.phone_number = phone_number;
	}


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


	/**
	 * @param userId
	 * @param username
	 * @param password
	 * @param role
	 * @param email
	 * @param gender
	 * @param address
	 * @param driver_license
	 * @param farm_utility
	 * @param payment_method
	 * @param payment_details
	 * @param pilot_license
	 * @param date_of_birth
	 * @param phone_number
	 * @param streetno
	 * @param unit_no
	 * @param city
	 * @param state
	 * @param zipcode
	 */
	public UserProfile(long userId, String username, String password, String role, String email, String gender,
			String address, String driver_license, String farm_utility, String payment_method, String payment_details,
			String pilot_license, LocalDate date_of_birth, Long phone_number, String streetno, String unit_no,
			String city, String state, int zipcode) {
		super();
		UserId = userId;
		this.username = username;
		this.password = password;
		this.role = role;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.driver_license = driver_license;
		this.farm_utility = farm_utility;
		this.payment_method = payment_method;
		this.payment_details = payment_details;
		this.pilot_license = pilot_license;
		this.date_of_birth = date_of_birth;
		this.phone_number = phone_number;
		this.streetno = streetno;
		this.unit_no = unit_no;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}


	public UserProfile() {
	}


	    
}
