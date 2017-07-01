package com.subhash.entity.adapter;

import com.subhash.hibernate.entitymanager.MyEntityManager;
import com.subhash.hibernate.model.Employee;

public class EmployeeAdapter extends MyEntityManager{
	
	public EmployeeAdapter() {
		super();
	}
	
	
	public boolean addProperty(Employee Employee) {

		boolean result = false;
			try {
				entityManager.getTransaction().begin();
				entityManager.persist(Employee);
				entityManager.getTransaction().commit();
				result = true;
			} catch (Exception ex) {
				ex.printStackTrace();
				return result;
			} finally {
				entityManager.close();
			}
		return result;
	}


}
