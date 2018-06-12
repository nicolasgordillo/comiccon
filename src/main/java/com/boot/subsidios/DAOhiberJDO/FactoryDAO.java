package com.boot.subsidios.DAOhiberJDO;

import com.boot.subsidios.DAO.GenericDAO;
import com.boot.subsidios.model.*;

public class FactoryDAO {
	
	public static GenericDAO<Proyecto> getProyectoDAO() {		
		return new GenericDAOhiberJDO<Proyecto>(Proyecto.class);
	}
	
	/*HACER con el resto del model */
}
