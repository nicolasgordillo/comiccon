package com.boot.subsidios.model;

public class IncisoProyecto {
	Long id;
	Float monto;
	Integer anio;
	
	public IncisoProyecto(Long id, Float monto, Integer anio) {
		super();
		this.id = id;
		this.monto = monto;
		this.anio = anio;
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
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
}
