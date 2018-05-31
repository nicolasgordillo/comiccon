package com.boot.subsidios.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.time.LocalDate;
import java.util.Map;

import com.boot.subsidios.model.Imputacion;

public class ImputacionStub {
	private static Map<Long, Imputacion> imputaciones = new HashMap<Long, Imputacion>();
	private static Long idIndex = 3L;
	private static LocalDate today = LocalDate.now(); 
	
	
	//Popular imputaciones iniciales
	static {
		//long id, LocalDate fecha, float monto, String descripcion
		Imputacion a = new Imputacion(1,today.minusDays(5),200, "Descripcion 1");
		imputaciones.put(1L, a);
		Imputacion b = new Imputacion(2, today.plusDays(5), 150, "Descripcion 2");
		imputaciones.put(2L, b);
		Imputacion c = new Imputacion(3, today.plusDays(10), 300, "Descripcion 3");
		imputaciones.put(3L, c);
				
	}

	public static List<Imputacion> list() {
		return new ArrayList<Imputacion>(imputaciones.values());
	}

	public static Imputacion create(Imputacion imputacion) {
		idIndex += idIndex;
		imputacion.setId(idIndex);
		imputaciones.put(idIndex, imputacion);
		return imputacion;
	}

	public static Imputacion get(Long id) {
		return imputaciones.get(id);
	}

	public static Imputacion update(Long id, Imputacion imputacion) {
		imputaciones.put(id, imputacion);
		return imputacion;
	}
	
	public static Imputacion delete(Long id) {
		return imputaciones.remove(id);
	}
	
}
