package com.subhash.applicationmain;

import org.apache.log4j.Logger;

import com.subhash.hibernatemodel.Employee;
import com.subhash.service.EmployeeService;
import com.subhash.serviceimplementation.EmployeeServiceImple;

public class AppMain 
{
	private final static Logger logger = Logger.getLogger(AppMain.class);
	static EmployeeService service = new EmployeeServiceImple();
    public static void main( String[] args )
    {
    	service.addProperty();
    	//System.out.println(service.getValueUsingID(new Employee(), "1"));
    	logger.info(" ************ add property finished ************ ");
    	logger.info(" ************ add property finished ************ ");
    }
    
    
    
    
}
