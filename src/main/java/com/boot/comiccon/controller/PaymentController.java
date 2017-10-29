package com.boot.comiccon.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.comiccon.model.Payment;
import com.boot.comiccon.repository.PaymentStub;

@RestController
@RequestMapping("api/v1/")
public class PaymentController {

	@RequestMapping(value = "payments", method = RequestMethod.GET)
	public List<Payment> list() {
		return PaymentStub.list();
	}
	
	@RequestMapping(value = "payments/{id}", method = RequestMethod.GET)
	public Payment get(@PathVariable long id) {
		return PaymentStub.get(id);
	}
	
	@RequestMapping(value = "payments", method = RequestMethod.POST)
	public Payment create(@RequestBody Payment payment) {
		return PaymentStub.create(payment);
	}
	
	@RequestMapping(value = "payments/{id}", method = RequestMethod.PUT)
	public Payment update(@PathVariable long id, @RequestBody Payment payment) {
		return PaymentStub.update(id, payment);
	}
	
	@RequestMapping(value = "payments/{id}", method = RequestMethod.DELETE)
	public Payment delete(@PathVariable long id) {
		return PaymentStub.delete(id);
	}
}
