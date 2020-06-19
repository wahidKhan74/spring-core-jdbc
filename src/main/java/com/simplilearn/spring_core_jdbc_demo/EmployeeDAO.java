package com.simplilearn.spring_core_jdbc_demo;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	// save emp
	public int saveEmployee(Employee emp) {
		String query = "insert into employee values('"+emp.getEmpId() +"','"+emp.getEmpName()+ "','"
				+emp.getEmpDept() +"','" + emp.getEmpSalary()+"')";
		return jdbcTemplate.update(query);
	}

	// update emp
	public int updateEmployee(Employee emp) {
	String query = "update employee set empName='"+emp.getEmpName()+ "',empSalary='"
					+ emp.getEmpSalary()+"' where empId='"+emp.getEmpId()+"'";
			return jdbcTemplate.update(query);
	}
	
	public int deleteEmployee(Employee emp) {
		String query = "delete from employee where empId="+ emp.getEmpId();
		return jdbcTemplate.update(query);
	}
	
}
