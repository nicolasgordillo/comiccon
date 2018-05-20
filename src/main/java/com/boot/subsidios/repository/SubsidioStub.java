package com.boot.subsidios.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import com.boot.subsidios.model.Subsidio;
import java.util.Date;

public class SubsidioStub {
	private static Map<Long, Subsidio> subsidios = new HashMap<Long, Subsidio>();
	private static Long idIndex = 3L;
	private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private static LocalDate today = LocalDate.now(); 
	
	
	//Popular subsidios iniciales
	static {
		Subsidio a = new Subsidio(1, 20000, 100, 2005, today,today.plusDays(5));
		subsidios.put(1L, a);
		Subsidio b = new Subsidio(2, 20000, 1500, 2005, today.minusDays(5),today.plusDays(5));
		subsidios.put(2L, b);
		Subsidio c = new Subsidio(3, 50000, 300, 2006, today.minusDays(7),today.plusDays(10));
		subsidios.put(3L, c);
				
	}

	public static List<Subsidio> list() {
		return new ArrayList<Subsidio>(subsidios.values());
	}

	public static Subsidio create(Subsidio subsidio) {
		idIndex += idIndex;
		subsidio.setId(idIndex);
		subsidios.put(idIndex, subsidio);
		return subsidio;
	}

	public static Subsidio get(Long id) {
		return subsidios.get(id);
	}

	public static Subsidio update(Long id, Subsidio subsidio) {
		subsidios.put(id, subsidio);
		return subsidio;
	}
	
	public static Subsidio delete(Long id) {
		return subsidios.remove(id);
	}
	
}
