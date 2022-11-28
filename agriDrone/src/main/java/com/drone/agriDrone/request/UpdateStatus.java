package com.drone.agriDrone.request;

public class UpdateStatus {

	long bookingId;
	
	String Status;

	public long getBookingID() {
		return bookingId;
	}

	public void setBookingID(long bookingId) {
		this.bookingId = bookingId;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public UpdateStatus(long bookingId, String status) {
		super();
		this.bookingId = bookingId;
		Status = status;
	}
}
