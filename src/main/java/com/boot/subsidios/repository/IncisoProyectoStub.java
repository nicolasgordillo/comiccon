package com.boot.subsidios.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.boot.subsidios.model.IncisoProyecto;

public class IncisoProyectoStub {
	private static Map<Long, IncisoProyecto> incisosProyecto = new HashMap<Long, IncisoProyecto>();
	private static Long idIndex = 3L;
	
	
	//Popular incisosProyecto iniciales
	static {
		//long id, float monto, int anio
		IncisoProyecto a = new IncisoProyecto(1,200, 2017);
		incisosProyecto.put(1L, a);
		IncisoProyecto b = new IncisoProyecto(2, 150, 2017);
		incisosProyecto.put(2L, b);
		IncisoProyecto c = new IncisoProyecto(3, 300, 2018);
		incisosProyecto.put(3L, c);
				
	}

	public static List<IncisoProyecto> list() {
		return new ArrayList<IncisoProyecto>(incisosProyecto.values());
	}

	public static IncisoProyecto create(IncisoProyecto incisoProyecto) {
		idIndex += idIndex;
		incisoProyecto.setId(idIndex);
		incisosProyecto.put(idIndex, incisoProyecto);
		return incisoProyecto;
	}

	public static IncisoProyecto get(Long id) {
		return incisosProyecto.get(id);
	}

	public static IncisoProyecto update(Long id, IncisoProyecto incisoProyecto) {
		incisosProyecto.put(id, incisoProyecto);
		return incisoProyecto;
	}
	
	public static IncisoProyecto delete(Long id) {
		return incisosProyecto.remove(id);
	}
	
}
