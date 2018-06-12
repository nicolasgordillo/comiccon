package com.boot.subsidios.model;
	
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;

public class PMF {
	//private static final PersistenceManagerFactory pmfInstance = JDOHelper.getPersistenceManagerFactory("test");
	private static final PersistenceManagerFactory pmfInstance = JDOHelper.getPersistenceManagerFactory("subsidios");
	public static PersistenceManager getPM(){
		return pmfInstance.getPersistenceManager() ;
	}
	

}

