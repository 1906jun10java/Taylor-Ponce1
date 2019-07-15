package com.revature.dao;
import java.sql.SQLException;
public interface EmployeeDAO {
	
	public abstract void createEmployeeID(int employeeID)
		throws SQLException ;
	
	
	public abstract void createDepartmentID(int departmentID)
		throws SQLException;
	
	public abstract void createSalary (double salary)
		throws SQLException;
	
	public abstract void addFirstname(String employeeFirstname)
		throws SQLException;

	public abstract void addLastname(String employeeLastname)
		throws SQLException;
	
	public abstract void addEmpemail(String empEmail)
		throws SQLException;
		
		
}
