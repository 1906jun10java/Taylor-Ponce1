package com.revature.dao;
import java.sql.SQLException;
import java.util.List;

import com.revature.beans.DepartmentBeans;


public interface DepartmentDAO 
{
	public abstract void createDepartmentID(int departmentID)
			throws SQLException;
	
	
	public abstract List<DepartmentBeans> createDepartmentname() 
			throws SQLException;

 
	
	
}
