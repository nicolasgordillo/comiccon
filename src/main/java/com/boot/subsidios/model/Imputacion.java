package com.boot.subsidios.model;

import java.time.LocalDate;

public class Imputacion {
	Long id;
	LocalDate fecha;
	Float monto;

	public Imputacion(Long id, LocalDate fecha, Float monto, String descripcion) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.monto = monto;
		this.descripcion = descripcion;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Float getMonto() {
		return monto;
	}
	public void setMonto(Float monto) {
		this.monto = monto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	String descripcion;
}
