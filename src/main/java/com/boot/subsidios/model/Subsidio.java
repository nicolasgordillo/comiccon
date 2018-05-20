package com.boot.subsidios.model;

import java.time.LocalDate;
import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Subsidio {
	long id;
	float monto;
	float saldoAImputar;
	int anio;
	LocalDate fechaAdjudicacion;
	LocalDate fechaAcreditacion;
	LocalDate fechaMaximaEjecucion;
	LocalDate fechaVencimiento;
	String resolucionUnlp;
	String nroOrdenPago;
	String nroExpediente;
	
	
	/**
	 * Constructor vacío
	 */
	public Subsidio() {	}

	public Subsidio(long id, float monto, float saldoAImputar, int anio, LocalDate fechaAdjudicacion,
			LocalDate fechaAcreditacion) {
		super();
		this.id = id;
		this.monto = monto;
		this.saldoAImputar = saldoAImputar;
		this.anio = anio;
		this.fechaAdjudicacion = fechaAdjudicacion;
		this.fechaAcreditacion = fechaAcreditacion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public float getSaldoAImputar() {
		return saldoAImputar;
	}

	public void setSaldoAImputar(float saldoAImputar) {
		this.saldoAImputar = saldoAImputar;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
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
}