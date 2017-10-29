package com.boot.comiccon.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.boot.comiccon.model.Payment;

public class PaymentStub {
	private static Map<Long, Payment> payments = new HashMap<Long, Payment>();
	private static Long idIndex = 3L;

	//populate initial payments
	static {
		Payment a = new Payment(1L, LocalDate.of(2017, 10, 29), (float)20.50, 3);
		payments.put(1L, a);
		Payment b = new Payment(2L, LocalDate.of(2017, 10, 30), (float)10, 1);
		payments.put(2L, b);
		Payment c = new Payment(3L, LocalDate.of(2017, 11, 01), (float)200, 6);
		payments.put(3L, c);
	}

	public static List<Payment> list() {
		return new ArrayList<Payment>(payments.values());
	}

	public static Payment create(Payment payment) {
		idIndex += idIndex;
		payment.setId(idIndex);
		payments.put(idIndex, payment);
		return payment;
	}

	public static Payment get(Long id) {
		return payments.get(id);
	}

	public static Payment update(Long id, Payment payment) {
		payments.put(id, payment);
		return payment;
	}

	public static Payment delete(Long id) {
		return payments.remove(id);
	}
}
