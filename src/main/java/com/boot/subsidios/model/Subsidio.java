package com.boot.subsidios.model;

import java.time.LocalDate;

public class Subsidio {
	Long id;
	Float monto;
	Float saldoAImputar;
	Integer anio;
	LocalDate fechaAdjudicacion;
	LocalDate fechaAcreditacion;
	LocalDate fechaMaximaEjecucion;
	LocalDate fechaVencimiento;
	String resolucionUnlp;
	String nroOrdenPago;
	String nroExpediente;
	String observaciones;
	Boolean rendido;
	
	public Subsidio(Long id, Float monto, Float saldoAImputar, Integer anio, LocalDate fechaAdjudicacion,
			LocalDate fechaAcreditacion, LocalDate fechaMaximaEjecucion, LocalDate fechaVencimiento,
			String resolucionUnlp, String nroOrdenPago, String nroExpediente, String observaciones, Boolean rendido) {
		super();
		this.id = id;
		this.monto = monto;
		this.saldoAImputar = saldoAImputar;
		this.anio = anio;
		this.fechaAdjudicacion = fechaAdjudicacion;
		this.fechaAcreditacion = fechaAcreditacion;
		this.fechaMaximaEjecucion = fechaMaximaEjecucion;
		this.fechaVencimiento = fechaVencimiento;
		this.resolucionUnlp = resolucionUnlp;
		this.nroOrdenPago = nroOrdenPago;
		this.nroExpediente = nroExpediente;
		this.observaciones = observaciones;
		this.rendido = rendido;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getMonto() {
		return monto;
	}

	public void setMonto(Float monto) {
		this.monto = monto;
	}

	public Float getSaldoAImputar() {
		return saldoAImputar;
	}

	public void setSaldoAImputar(Float saldoAImputar) {
		this.saldoAImputar = saldoAImputar;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public LocalDate getFechaAdjudicacion() {
		return fechaAdjudicacion;
	}

	public void setFechaAdjudicacion(LocalDate fechaAdjudicacion) {
		this.fechaAdjudicacion = fechaAdjudicacion;
	}

	public LocalDate getFechaAcreditacion() {
		return fechaAcreditacion;
	}

	public void setFechaAcreditacion(LocalDate fechaAcreditacion) {
		this.fechaAcreditacion = fechaAcreditacion;
	}

	public LocalDate getFechaMaximaEjecucion() {
		return fechaMaximaEjecucion;
	}

	public void setFechaMaximaEjecucion(LocalDate fechaMaximaEjecucion) {
		this.fechaMaximaEjecucion = fechaMaximaEjecucion;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getResolucionUnlp() {
		return resolucionUnlp;
	}

	public void setResolucionUnlp(String resolucionUnlp) {
		this.resolucionUnlp = resolucionUnlp;
	}

	public String getNroOrdenPago() {
		return nroOrdenPago;
	}

	public void setNroOrdenPago(String nroOrdenPago) {
		this.nroOrdenPago = nroOrdenPago;
	}

	public String getNroExpediente() {
		return nroExpediente;
	}

	public void setNroExpediente(String nroExpediente) {
		this.nroExpediente = nroExpediente;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Boolean getRendido() {
		return rendido;
	}

	public void setRendido(Boolean rendido) {
		this.rendido = rendido;
	}
}
