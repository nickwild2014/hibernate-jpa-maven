package com.subhash.applicationmain;

import org.apache.log4j.Logger;

import com.subhash.service.EmployeeService;
import com.subhash.serviceimplementation.EmployeeServiceImple;

public class AppMain 
{
	private final static Logger logger = Logger.getLogger(AppMain.class);
	static EmployeeService service = new EmployeeServiceImple();
    public static void main( String[] args )
    {
    	service.addProperty();
    	logger.info(" ************ add property finished ************ ");
    }
    
    
    
    
}
