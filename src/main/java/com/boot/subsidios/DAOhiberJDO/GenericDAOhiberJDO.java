package com.boot.subsidios.DAOhiberJDO;

import java.util.List;

import javax.jdo.PersistenceManager;
//import javax.persistence.PersistenceManagerFactory;
import javax.jdo.PersistenceManagerFactory;

import com.boot.subsidios.DAO.GenericDAO;
import com.boot.subsidios.model.PMF;

public class GenericDAOhiberJDO<T> implements GenericDAO<T> {
	protected Class<T> objectType;
	public PersistenceManager persistenceManager;
	
	public GenericDAOhiberJDO(Class<T> objectType) {
		this.objectType = objectType;
		this.persistenceManager = PMF.getPM();
	}	
	
	public T save(T newInstance) {
		return persistenceManager.makePersistent(newInstance);	
	}

	public void update(T persistenceInstance) {
		//persistenceManager
		//persistenceManager.merge(persistenceInstance);
	}
	
	public void remove(T persistenceInstance) {
		persistenceManager.deletePersistent(persistenceInstance);
		//persistenceManager.remove(persistenceManager.merge(persistenceInstance));
		//persistenceManager.remove(persistenceInstance);
	}
	
	public void removeById(long id) {
		/*
		T object = persistenceManager.find(objectType, id);
		persistenceManager.remove(object);
		*/
		persistenceManager.deletePersistent(this.getById(id));
		
	}
	
	@SuppressWarnings("unchecked")	
	public List<T> getAll() {
		
		List<T> all=(List<T>)(persistenceManager.newQuery("from "+ this.objectType.getSimpleName()).execute());
		//List<T> all=(List<T>)(persistenceManager.createQuery("from "+ this.objectType.getSimpleName()).getResultList());					
		return all;
	}
	
	public T getById(long id) {
		T object = persistenceManager.getObjectById(objectType, id);	
		return object;
	}
	
}
