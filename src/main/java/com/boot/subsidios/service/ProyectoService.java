package com.boot.subsidios.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.boot.subsidios.DAO.ProyectoDAO;
import com.boot.subsidios.DAOhiberJDO.FactoryDAO;
import com.boot.subsidios.model.Proyecto;

@Service
public class ProyectoService {
	
	ProyectoDAO dao = FactoryDAO.getProyectoDAO();
	
	public List<Proyecto> getAll() {
		return dao.getAll();
	}
	
	public Proyecto save(Proyecto proyecto) {
		return dao.save(proyecto);
	}
}
