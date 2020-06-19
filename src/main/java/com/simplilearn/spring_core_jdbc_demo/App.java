package com.simplilearn.spring_core_jdbc_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
    	EmployeeDAO edao = (EmployeeDAO)context.getBean("empDao");
    	Employee emp1 = context.getBean("emp1",Employee.class);
    	
//    	System.out.println("Insert Employee Object");
//    	edao.saveEmployee(emp1);
    	
//    	System.out.println("Update Employee Object");
//    	edao.updateEmployee(emp1);
    	
    	
    	System.out.println("Delete Employee Object");
    	edao.deleteEmployee(emp1);
    	
 
    	}
}
