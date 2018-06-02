package com.boot.subsidios.model;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class IncisoProyecto {
	long id;
	float monto;
	int anio;
	//Proyecto proyecto;
	
	/**
	 * 
	 */
	public IncisoProyecto() {
		super();
	}

	/**
	 * @param id
	 * @param monto
	 * @param anio
	 * @param proyecto
	 */
	public IncisoProyecto(long id, float monto, int anio/*, Proyecto proyecto*/) {
		super();
		this.id = id;
		this.monto = monto;
		this.anio = anio;
		//this.proyecto = proyecto;
		
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

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	/*
	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	*/
	
}
