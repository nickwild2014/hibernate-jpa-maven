package com.subhash.serviceimplementation;

import com.subhash.entity.adapter.EmployeeAdapter;
import com.subhash.hibernatemodel.Employee;
import com.subhash.service.EmployeeService;

public class EmployeeServiceImple implements EmployeeService{

	@Override
	public void addProperty() {
		
		Employee e1 = new Employee();
    	e1.setOperation("test");
		new EmployeeAdapter().addProperty(e1);
		
	}

}
