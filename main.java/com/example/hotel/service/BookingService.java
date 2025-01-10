package com.example.hotel.service;

import java.time.temporal.ChronoUnit;

import com.example.hotel.dao.BookingDao;
import com.example.hotel.model.BookingRequest;

public class BookingService {
	private final PaymentService paymentService;
	private final RoomService roomService;
	private final BookingDao bookingDao;
	private final MailSender mailSender;
	
	
	public BookingService(PaymentService paymentService, RoomService roomService, BookingDao bookingDao,
			MailSender mailSender) {
		super();
		this.paymentService = paymentService;
		this.roomService = roomService;
		this.bookingDao = bookingDao;
		this.mailSender = mailSender;
	}

	private final static double BASE_PRICE = 150;

	public void confirmBooking(BookingRequest bookingRequest) {

	}

	public double calculatePrice(BookingRequest bookingRequest) {
		return ChronoUnit.DAYS.between(bookingRequest.getFromDate(), bookingRequest.getToDate()) * BASE_PRICE
				* bookingRequest.getGuestCount();
	}
	
}
