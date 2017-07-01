package com.subhash.applicationmain;

import com.subhash.service.EmployeeService;
import com.subhash.serviceimplementation.EmployeeServiceImple;

public class AppMain 
{
	static EmployeeService service = new EmployeeServiceImple();
    public static void main( String[] args )
    {
    	service.addProperty();
    }
    
    
}
