package com.example.hotel.model;

import java.time.LocalDate;

public class BookingRequest {
	private String userId;
	private LocalDate fromDate;
	private LocalDate toDate;
	private int guestCount;
	private boolean prepaid;

	public BookingRequest() {
	}

	public BookingRequest(String userId, LocalDate fromDate, LocalDate toDate, int guestCount, boolean prepaid) {
		super();
		this.userId = userId;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.guestCount = guestCount;
		this.prepaid = prepaid;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public int getGuestCount() {
		return guestCount;
	}

	public void setGuestCount(int guestCount) {
		this.guestCount = guestCount;
	}

	public boolean isPrepaid() {
		return prepaid;
	}

	public void setPrepaid(boolean prepaid) {
		this.prepaid = prepaid;
	}

}
