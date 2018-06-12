package com.boot.subsidios.DAOhiberJDO;

import java.util.List;

import com.boot.subsidios.DAO.ProyectoDAO;
import com.boot.subsidios.model.*;

public class ProyectoDAOhiberJDO extends GenericDAOhiberJDO<Proyecto>  implements ProyectoDAO{
		
		public ProyectoDAOhiberJDO() {
			super(Proyecto.class);
		}

		
		@SuppressWarnings("unchecked")	
		public List<IncisoProyecto> getAllIncisos(long idProyecto) {
			return null;
			/*
			Query consulta = entityManager.createQuery("from Pago where socioId = '"+idSocio+"' ");
			return (consulta.getResultList());
			*/
		}
}
