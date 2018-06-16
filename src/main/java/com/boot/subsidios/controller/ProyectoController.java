package com.boot.subsidios.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.subsidios.model.Proyecto;
import com.boot.subsidios.repository.ProyectoRepository;
import com.boot.subsidios.repository.ProyectoStub;

@RestController
@RequestMapping("api/v1/")
public class ProyectoController {

	private ProyectoRepository repository;
	
	@RequestMapping(value = "proyectos", method = RequestMethod.GET)
	public List<Proyecto> list() {
		//return ProyectoStub.list();
		return repository.list();
	}
	
	@RequestMapping(value = "proyectos/{id}", method = RequestMethod.GET)
	public Proyecto get(@PathVariable long id) {
		return ProyectoStub.get(id);
	}
	
	//@Transactional
	@RequestMapping(value = "proyectos", method = RequestMethod.POST)
	public Proyecto create(@RequestBody Proyecto proyecto) {
		return ProyectoStub.create(proyecto);
	}
	
	@RequestMapping(value = "proyectos/{id}", method = RequestMethod.PUT)
	public Proyecto update(@PathVariable long id, @RequestBody Proyecto proyecto) {
		return ProyectoStub.update(id, proyecto);
	}
	
	@RequestMapping(value = "proyectos/{id}", method = RequestMethod.DELETE)
	public Proyecto delete(@PathVariable long id) {
		return ProyectoStub.delete(id);
	}
}
