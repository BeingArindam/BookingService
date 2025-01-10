package com.example.hotel.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.hotel.dao.BookingDao;
import com.example.hotel.model.BookingRequest;

class BookingServiceTest {

	private BookingService bookingService;
	private PaymentService paymentService;
	private RoomService roomService;
	private BookingDao bookingDao;
	private MailSender mailSender;

	@BeforeEach
	void setUp() throws Exception {
		paymentService = mock(PaymentService.class);
		roomService = mock(RoomService.class);
		bookingDao = mock(BookingDao.class);
		mailSender = mock(MailSender.class);

		this.bookingService = new BookingService(paymentService, roomService, bookingDao, mailSender);
	}

	@Test
	void testCalculatePrice() {
		BookingRequest bookingRequest = new BookingRequest("0012-567", LocalDate.of(2025, Month.JANUARY, 1), LocalDate.of(2025, Month.JANUARY, 5), 2, false);
		double calculatePrice = bookingService.calculatePrice(bookingRequest);
		System.out.printf("calculated %f",calculatePrice);
	}

}
