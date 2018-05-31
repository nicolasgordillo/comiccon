package com.boot.subsidios.model;

import java.time.LocalDate;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Imputacion {
	long id;
	LocalDate fecha;
	float monto;	
	String descripcion;
	
	/**
	 * 
	 */
	public Imputacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param id
	 * @param fecha
	 * @param monto
	 * @param descripcion
	 */
	public Imputacion(long id, LocalDate fecha, float monto, String descripcion) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.monto = monto;
		this.descripcion = descripcion;
	}
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
