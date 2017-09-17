package com.subhash.service;

import com.subhash.hibernatemodel.Employeeee;

public interface EmployeeService {
	
	void addProperty();
	void updateProperty(Employeeee e,String i);
	void removePropertyById(Employeeee e,String i);
	String findValueUsingID(Employeeee e, String i);
	

}
