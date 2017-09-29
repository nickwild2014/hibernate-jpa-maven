package com.subhash.applicationmain;
import java.math.BigDecimal;
import java.util.List;
import org.apache.log4j.Logger;
import com.subhash.entityadapter.EmployeeAdapter;
import com.subhash.hibernatemodel.Employeeee;
import com.subhash.service.EmployeeService;
import com.subhash.serviceimplementation.EmployeeServiceImple;

public class AppMain 
{
	private final static Logger logger = Logger.getLogger(AppMain.class);
	static EmployeeService service = new EmployeeServiceImple();
    public static void main( String[] args )
    {
    	
//    	List l = em.createQuery(    "SELECT e " +
//    	        "FROM Professor e " +
//    	        "WHERE e.department = :dept AND " +
//    	        "      e.salary = (SELECT MAX(e2.salary) " +
//    	        "                  FROM Professor e2 " +
//    	        "                  WHERE e2.department = :dept)")
//    	        .setParameter("dept", d)
//    	        .getResultList();
    	
    	service.addProperty();
    	//getValueFromKey();
    	
    	service.removePropertyById(new Employeeee(), "59");			
    	//service.removePropertyById(new Employeeee(), "63");
    	//service.removePropertyById(new Employeeee(), "69");
    	//System.out.println(service.findValueUsingID(new Employeeee(), "57"));
    	
//    	Employeeee emp = new Employeeee();
//    	emp.setId(new BigDecimal("61"));
//    	emp.setBranch("branch1");
//    	emp.setOperation("operation1");
//    	emp.setService("service1");
//    	service.updateProperty(emp, "");
    	logger.info(" ************ add property finished ************ ");
    }
	public static String getValueFromKey() {
		List<Employeeee> aPropertyList = new EmployeeAdapter().getAllProperties();
		for (Employeeee aBridgeproperties : aPropertyList) {
			logger.info("aBridgeproperties.getOperation() "+aBridgeproperties.getOperation());
		}
		return "";
	}
}
