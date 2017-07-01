package com.subhash.hibernatemaster.hibernate;

import com.subhash.service.EmployeeService;
import com.subhash.service.implementation.EmployeeServiceImple;

public class AppMain 
{
	static EmployeeService service = new EmployeeServiceImple();
    public static void main( String[] args )
    {
    	service.addProperty();
    }
    
    
}
