package com.boot.subsidios.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.subsidios.model.Imputacion;
import com.boot.subsidios.repository.ImputacionStub;

@RestController
@RequestMapping("api/v1/")
public class ImputacionController {

	@RequestMapping(value = "imputaciones", method = RequestMethod.GET)
	public List<Imputacion> list() {
		return ImputacionStub.list();
	}
	
	@RequestMapping(value = "imputaciones/{id}", method = RequestMethod.GET)
	public Imputacion get(@PathVariable long id) {
		return ImputacionStub.get(id);
	}
	
	@RequestMapping(value = "imputaciones", method = RequestMethod.POST)
	public Imputacion create(@RequestBody Imputacion imputacion) {
		return ImputacionStub.create(imputacion);
	}
	
	@RequestMapping(value = "imputaciones/{id}", method = RequestMethod.PUT)
	public Imputacion update(@PathVariable long id, @RequestBody Imputacion imputacion) {
		return ImputacionStub.update(id, imputacion);
	}
	
	@RequestMapping(value = "imputaciones/{id}", method = RequestMethod.DELETE)
	public Imputacion delete(@PathVariable long id) {
		return ImputacionStub.delete(id);
	}
}
