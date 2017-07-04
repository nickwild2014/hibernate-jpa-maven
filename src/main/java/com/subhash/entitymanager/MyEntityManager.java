package com.subhash.entitymanager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

public class MyEntityManager {
	
	
	private final String PERSISTENCE_UNIT_NAME = "MyPersistenceUnit";

	@PersistenceUnit(name = "", unitName = "")
	public EntityManagerFactory entityManagerFactory;

	@PersistenceContext(unitName = PERSISTENCE_UNIT_NAME)
	public EntityManager entityManager;

	public MyEntityManager() {
		try {
			entityManagerFactory = Persistence
					.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
			entityManager = entityManagerFactory.createEntityManager();
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
	}

}
