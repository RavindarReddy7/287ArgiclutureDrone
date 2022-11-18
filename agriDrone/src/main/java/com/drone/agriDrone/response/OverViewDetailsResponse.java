package com.drone.agriDrone.response;

import org.springframework.stereotype.Component;

@Component
public class OverViewDetailsResponse {
	private int totalBookings;
	private int activeBookings;
	private int completedBookings;
	private int lastCompletedBooking;
	private int upComingBookings;
	
	
	/**
	 * @param totalBookings
	 * @param activeBookings
	 * @param completedBookings
	 * @param lastCompletedBooking
	 * @param upComingBookings
	 */
	public OverViewDetailsResponse(int totalBookings, int activeBookings, int completedBookings,
			int lastCompletedBooking, int upComingBookings) {
		this.totalBookings = totalBookings;
		this.activeBookings = activeBookings;
		this.completedBookings = completedBookings;
		this.lastCompletedBooking = lastCompletedBooking;
		this.upComingBookings = upComingBookings;
	}
	/**
	 * 
	 */
	public OverViewDetailsResponse() {
		super();
	}
	/**
	 * @return the totalBookings
	 */
	public int getTotalBookings() {
		return totalBookings;
	}
	/**
	 * @param totalBookings the totalBookings to set
	 */
	public void setTotalBookings(int totalBookings) {
		this.totalBookings = totalBookings;
	}
	/**
	 * @return the activeBookings
	 */
	public int getActiveBookings() {
		return activeBookings;
	}
	/**
	 * @param activeBookings the activeBookings to set
	 */
	public void setActiveBookings(int activeBookings) {
		this.activeBookings = activeBookings;
	}
	/**
	 * @return the completedBookings
	 */
	public int getCompletedBookings() {
		return completedBookings;
	}
	/**
	 * @param completedBookings the completedBookings to set
	 */
	public void setCompletedBookings(int completedBookings) {
		this.completedBookings = completedBookings;
	}
	/**
	 * @return the lastCompletedBooking
	 */
	public int getLastCompletedBooking() {
		return lastCompletedBooking;
	}
	/**
	 * @param lastCompletedBooking the lastCompletedBooking to set
	 */
	public void setLastCompletedBooking(int lastCompletedBooking) {
		this.lastCompletedBooking = lastCompletedBooking;
	}
	/**
	 * @return the upComingBookings
	 */
	public int getUpComingBookings() {
		return upComingBookings;
	}
	/**
	 * @param upComingBookings the upComingBookings to set
	 */
	public void setUpComingBookings(int upComingBookings) {
		this.upComingBookings = upComingBookings;
	}

}
