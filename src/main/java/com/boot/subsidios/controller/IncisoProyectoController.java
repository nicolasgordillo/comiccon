package com.boot.subsidios.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.subsidios.model.IncisoProyecto;
import com.boot.subsidios.repository.IncisoProyectoStub;

@RestController
@RequestMapping("api/v1/")
public class IncisoProyectoController {

	@RequestMapping(value = "incisosProyecto", method = RequestMethod.GET)
	public List<IncisoProyecto> list() {
		return IncisoProyectoStub.list();
	}
	
	@RequestMapping(value = "incisosProyecto/{id}", method = RequestMethod.GET)
	public IncisoProyecto get(@PathVariable long id) {
		return IncisoProyectoStub.get(id);
	}
	
	@RequestMapping(value = "incisosProyecto", method = RequestMethod.POST)
	public IncisoProyecto create(@RequestBody IncisoProyecto incisoProyecto) {
		return IncisoProyectoStub.create(incisoProyecto);
	}
	
	@RequestMapping(value = "incisosProyecto/{id}", method = RequestMethod.PUT)
	public IncisoProyecto update(@PathVariable long id, @RequestBody IncisoProyecto incisoProyecto) {
		return IncisoProyectoStub.update(id, incisoProyecto);
	}
	
	@RequestMapping(value = "incisosProyecto/{id}", method = RequestMethod.DELETE)
	public IncisoProyecto delete(@PathVariable long id) {
		return IncisoProyectoStub.delete(id);
	}
}
