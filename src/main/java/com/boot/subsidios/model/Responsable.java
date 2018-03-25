package com.boot.subsidios.model;

public class Responsable {
	Long id;
	Integer dni;
	String apellido;
	String nombre;
	
	public Responsable(Long id, Integer dni, String apellido, String nombre) {
		this.id = id;
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
	}
	
}
