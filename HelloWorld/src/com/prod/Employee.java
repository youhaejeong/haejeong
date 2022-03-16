package com.prod;

//this.salary =salary;//필드릴 채우겟다
//this. 하면 필드 지정 
//set메소드는 값을 지정하기 위한 메소드 
public class Employee {
	// field
	int employeeId;
	String employeeName;
	String department;
	String job;
	private int salary; // (급여
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId; 
	}
	public int getEmployeeId() {
		return this.employeeId;
		
	}				
	public void setemployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeName() {
		return this.employeeName;
	}
	public void setdepartment(String department) {
		 this.department = department;
	}
	public String getdepartment() {
		return this.department;
	}
	public void setjob(String job) {
		 this.job = job;
	}
	public String getjob() {
		return this.job;
	}
	
	
	

	public void setSalary(int salary) {
		if (salary < 0) {
			this.salary = 10000;

		} else {
			this.salary = salary;
		}
	}

	public int getSalary() {
		return this.salary;
	}
	
	public String getEmpInfo() {
		String result = this.employeeName+ "의 부서는 " + this.department//
				+"이고 직무는 "+this.job +"이고 급여는 " + this.salary +"입니다";
		return result;
	}
}
