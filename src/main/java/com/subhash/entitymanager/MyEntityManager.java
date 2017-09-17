package com.subhash.entitymanager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

public class MyEntityManager {
	public EntityManager entityManager;
	private final static String PERSISTENCE_UNIT_NAME = "MyPersistenceUnit";
	@PersistenceUnit(name = "", unitName = "")
	public static EntityManagerFactory entityManagerFactory;
	
	private static class SingletonHolder {  
		static final  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }    
    public static EntityManagerFactory getEntityManagerFactoryInstance() {    
        return SingletonHolder.entityManagerFactory;    
    }  
	public MyEntityManager() {
		try {
			entityManagerFactory = getEntityManagerFactoryInstance();
			//entityManagerFactory= Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
			entityManager = entityManagerFactory.createEntityManager();
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
	}
	public EntityManager getEntityManager() {
		try {
			entityManager = entityManagerFactory.createEntityManager();
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		return entityManager;
	}
	

}
