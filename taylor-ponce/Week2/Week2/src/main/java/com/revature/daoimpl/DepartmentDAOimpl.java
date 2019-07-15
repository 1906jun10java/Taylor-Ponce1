package com.revature.daoimpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.revature.beans.DepartmentBeans;

import com.revature.dao.DepartmentDAO;
import com.revature.utilities.ConnFactory;

public class DepartmentDAOimpl implements DepartmentDAO {
	public static ConnFactory cf= ConnFactory.getInstance();
		
	
	
	public void createDepartmentID(int departmentID) throws SQLException {
		Connection conn =cf.getConnection();
		String sql ="{call INSERTDEPARTMNT_ID(?)";
		CallableStatement call = conn.prepareCall(sql);
		call.setInt(1, departmentID);
		call.execute();
		}
		
	

	public void createDepartmentname(String departmentName) throws SQLException {
	
		
	}



	public List<DepartmentBeans> createDepartmentname() throws SQLException {
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("Select * FROM DEPARTMENT");
		DepartmentBeans d = null; 
		while (rs.next()) {
			d = new DepartmentBeans();
			
		}
			return createDepartmentname();
	
	}

}
