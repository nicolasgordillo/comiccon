package com.boot.subsidios.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boot.subsidios.model.Proyecto;
import com.boot.subsidios.service.ProyectoService;

@Repository
public class ProyectoRepository {

	@Autowired
	ProyectoService service = new ProyectoService();
	
	public List<Proyecto> list() {
		return service.getAll();
	}

	public Proyecto save(Proyecto proyecto){
		return service.save(proyecto);
	}
	/*
	public static Proyecto create(Proyecto proyecto) {
		idIndex += idIndex;
		proyecto.setId(idIndex);
		proyectos.put(idIndex, proyecto);
		return proyecto;
	}

	public static Proyecto get(Long id) {
		return proyectos.get(id);
	}

	public static Proyecto update(Long id, Proyecto proyecto) {
		proyectos.put(id, proyecto);
		return proyecto;
	}

	public static Proyecto delete(Long id) {
		return proyectos.remove(id);
	}
	*/
}
