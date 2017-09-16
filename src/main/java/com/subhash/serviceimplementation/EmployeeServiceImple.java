package com.subhash.serviceimplementation;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import com.subhash.entityadapter.EmployeeAdapter;
import com.subhash.entitymanager.MyEntityManager;
import com.subhash.hibernatemodel.Employee;
import com.subhash.service.EmployeeService;

public class EmployeeServiceImple implements EmployeeService{

	public void addProperty() {
		
		Employee e1 = new Employee();
    	e1.setOperation("test");
		new EmployeeAdapter().addProperty(e1);
		
	}

	public String getValueUsingID(Employee e, String i) {
		EntityManager entityManager = new MyEntityManager().getEntityManager();
		entityManager.getTransaction().begin();
		e = entityManager.find(e.getClass(), new BigDecimal(i));
		entityManager.getTransaction().commit();
		return e.getOperation();
	}

}
