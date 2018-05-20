package com.boot.subsidios.model;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Proyecto {
	Long id;
	String nombre;
	Integer anioInicio;
	Integer anioFin;
	
	public Proyecto() { }

	public Proyecto(Long id, String nombre, Integer anioInicio, Integer anioFin) {
		this.id = id;
		this.nombre = nombre;
		this.anioInicio = anioInicio;
		this.anioFin = anioFin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getAnioInicio() {
		return anioInicio;
	}

	public void setAnioInicio(Integer anioInicio) {
		this.anioInicio = anioInicio;
	}

	public Integer getAnioFin() {
		return anioFin;
	}

	public void setAnioFin(Integer anioFin) {
		this.anioFin = anioFin;
	}
}