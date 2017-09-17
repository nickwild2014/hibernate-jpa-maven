package com.subhash.serviceimplementation;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import com.subhash.entityadapter.EmployeeAdapter;
import com.subhash.entitymanager.MyEntityManager;
import com.subhash.hibernatemodel.Department;
import com.subhash.hibernatemodel.Employeeee;
import com.subhash.service.EmployeeService;

public class EmployeeServiceImple implements EmployeeService {

	public void addProperty() {

		Employeeee e1 = new Employeeee();
		Department d = new Department();
		e1.setBranch("test");
		d.setBranch("testdub");
		Department d1 = new Department();
		d1.setBranch("testdub2");
		e1.setDepartment(d);
		new EmployeeAdapter().addProperty(e1,d,d1);

	}

	public String findValueUsingID(Employeeee e, String i) {
		EntityManager entityManager = new MyEntityManager().getEntityManager();
		entityManager.getTransaction().begin();
		e = entityManager.find(e.getClass(), new BigDecimal(i));
		entityManager.getTransaction().commit();
		return e.getOperation();
	}

	@Override
	public void removePropertyById(Employeeee e, String i) {
		EntityManager entityManager = new MyEntityManager().getEntityManager();
		entityManager.getTransaction().begin();
		e = entityManager.find(e.getClass(), new BigDecimal(i));
		if (e != null)
		{
			System.out.println("null");
			entityManager.remove(e);
		}
			
		entityManager.getTransaction().commit();

	}

	@Override
	public void updateProperty(Employeeee ee, String i) {
		EntityManager entityManager = new MyEntityManager().getEntityManager();
		entityManager.getTransaction().begin();
		if (entityManager.find(ee.getClass(), ee.getId()) != null) {
			entityManager.merge(ee);
		}
		entityManager.getTransaction().commit();
	}

}
