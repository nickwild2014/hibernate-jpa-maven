package com.subhash.entityadapter;
import java.util.List;
import javax.persistence.Query;
import com.subhash.entitymanager.MyEntityManager;
import com.subhash.hibernatemodel.Department;
import com.subhash.hibernatemodel.Employeeee;

public class EmployeeAdapter extends MyEntityManager{
	
	public EmployeeAdapter() {
		super();
	}
	
	
	public boolean addProperty(Employeeee Employee, Department d, Department d1) {

		boolean result = false;
			try {
				entityManager.getTransaction().begin();
				entityManager.persist(Employee);
				entityManager.persist(d);
				entityManager.persist(d1);
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
	
	public List<Employeeee> getAllProperties() {

		List<Employeeee> bridgePropertyList = null;
		if (entityManager!=null) {
			try {
				entityManager.getTransaction().begin();
				Query query = entityManager.createNamedQuery("Employeeee.findAll");
				bridgePropertyList = query.getResultList();
			} catch (Exception ex) {
				ex.printStackTrace();
			} finally {
				entityManager.close();
			}
		} else {
			System.out.println("Entity Manager is null");
		}
		return bridgePropertyList;
	}
	



}
