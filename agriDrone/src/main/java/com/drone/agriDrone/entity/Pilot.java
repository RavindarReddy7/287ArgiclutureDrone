
package com.drone.agriDrone.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name ="Pilot")
public class Pilot {
	private @Id @GeneratedValue (strategy = GenerationType.AUTO) long id;
	private String name;
	@Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}", flags = Pattern.Flag.CASE_INSENSITIVE)
	@Column(unique = true)
	private String email;
	private String password;
	private String gender;
	private LocalDate date_of_birth;
	private Long phone_number;
	private String license_details;
	//licenseimage
	private String pilot_license;
	private String address;
	private String role;
	private String streetno;
	private String unit_no;
	private String city;
	private String state;
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
	private int zipcode;
	
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
	public LocalDate getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(LocalDate date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public Long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(Long phone_number) {
		this.phone_number = phone_number;
	}
	public String getLicense_details() {
		return license_details;
	}
	public void setLicense_details(String license_details) {
		this.license_details = license_details;
	}
	public String getPilot_license() {
		return pilot_license;
	}
	public void setPilot_license(String pilot_license) {
		this.pilot_license = pilot_license;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public Pilot() {
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param password
	 * @param gender
	 * @param date_of_birth
	 * @param phone_number
	 * @param license_details
	 * @param pilot_license
	 * @param address
	 * @param role
	 * @param streetno
	 * @param unit_no
	 * @param city
	 * @param state
	 * @param zipcode
	 */
	public Pilot(long id, String name, String email, String password, String gender, LocalDate date_of_birth,
			Long phone_number, String license_details, String pilot_license, String address, String role,
			String streetno, String unit_no, String city, String state, int zipcode) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.date_of_birth = date_of_birth;
		this.phone_number = phone_number;
		this.license_details = license_details;
		this.pilot_license = pilot_license;
		this.address = address;
		this.role = role;
		this.streetno = streetno;
		this.unit_no = unit_no;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
}
