package com.boot.subsidios.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.boot.subsidios.model.Proyecto;

public class ProyectoStub {
	private static Map<Long, Proyecto> proyectos = new HashMap<Long, Proyecto>();
	private static Long idIndex = 3L;

	//Popular proyectos iniciales
	static {
		Proyecto a = new Proyecto(1L, "Proyecto 1", 2005, 2007); //LocalDate.of(2017, 10, 29)
		proyectos.put(1L, a);
		Proyecto b = new Proyecto(2L, "Proyecto 2", 2002, 2009);
		proyectos.put(2L, b);
		Proyecto c = new Proyecto(3L, "Proyecto 3", 2015, 2016);
		proyectos.put(3L, c);
	}

	public static List<Proyecto> list() {
		return new ArrayList<Proyecto>(proyectos.values());
	}

	public static Proyecto create(Proyecto proyecto) {
		idIndex += idIndex;
		proyecto.setId(idIndex);
		proyectos.put(idIndex, proyecto);
		return proyecto;
	}

	public static Proyecto get(Long id) {
		return proyectos.get(id);
	}

	public static Proyecto update(Long id, Proyecto proyecto) {
		proyectos.put(id, proyecto);
		return proyecto;
	}

	public static Proyecto delete(Long id) {
		return proyectos.remove(id);
	}
}
