package com.boot.subsidios.DAO;

import java.util.List;
import com.boot.subsidios.model.*;

public interface ProyectoDAO extends GenericDAO<Proyecto>{
		
	List<IncisoProyecto> getAllIncisos(long idProyecto);
}
