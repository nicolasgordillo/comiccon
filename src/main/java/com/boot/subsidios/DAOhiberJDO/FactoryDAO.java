package com.boot.subsidios.DAOhiberJDO;

import com.boot.subsidios.DAO.*;
import com.boot.subsidios.model.*;

public class FactoryDAO {
	/*
	public static GenericDAO<Proyecto> getProyectoDAO() {		
		return new GenericDAOhiberJDO<Proyecto>(Proyecto.class);
	}
	*/

	public static ProyectoDAO getProyectoDAO() {
		return new ProyectoDAOhiberJDO();
	}
	
	/*HACER con el resto del model */
}
