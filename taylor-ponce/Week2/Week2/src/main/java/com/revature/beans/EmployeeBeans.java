package com.revature.beans;

public class EmployeeBeans {
	private int employeeID;
	private String employeeFirstname;
	private String employeeLastname;
	private int departmentID;
	private double salary;
	private String empEmail;

	public EmployeeBeans() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the employeeID
	 */
	public int getEmployeeID() {
		return employeeID;
	}

	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	/**
	 * @return the employeeFirstname
	 */
	public String getEmployeeFirstname() {
		return employeeFirstname;
	}

	/**
	 * @param employeeFirstname the employeeFirstname to set
	 */
	public void setEmployeeFirstname(String employeeFirstname) {
		this.employeeFirstname = employeeFirstname;
	}

	/**
	 * @return the employeeLastname
	 */
	public String getEmployeeLastname() {
		return employeeLastname;
	}

	/**
	 * @param employeeLastname the employeeLastname to set
	 */
	public void setEmployeeLastname(String employeeLastname) {
		this.employeeLastname = employeeLastname;
	}

	/**
	 * @return the departmentID
	 */
	public int getDepartmentID() {
		return departmentID;
	}

	/**
	 * @param departmentID the departmentID to set
	 */
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the empEmail
	 */
	public String getEmpEmail() {
		return empEmail;
	}

	/**
	 * @param empEmail the empEmail to set
	 */
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	@Override
	public String toString() {
		return "EmployeeBeans [employeeID=" + employeeID + ", employeeFirstname=" + employeeFirstname
				+ ", employeeLastname=" + employeeLastname + ", departmentID=" + departmentID + ", salary=" + salary
				+ ", empEmail=" + empEmail + "]";
	}
}
