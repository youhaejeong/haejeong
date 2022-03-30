package com.prod.emp;

public class Employee {
	// employee 테이블의 칼럼에 해당되는 요소를 담아놓기위한 필드설정
	private int employeeId; // employees.employee_id //매칭이됨
	private String firstName;// employees.first_name
	private String lastName;
	private String email;
	private int salary;
	private String hireDate;
	private String jobId;
	private String phoneNumber;

	public Employee() {

	}//기본생성자가 없으면 empDAO에서 오류남!
	

	public Employee( String firstName, String phoneNumber, int salary,int employeeId) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
	}




	public Employee(int employeeId, String lastName, String email, String hireDate, String jobId) {
		super();
		this.employeeId = employeeId;
		this.lastName = lastName;
		this.email = email;
		this.hireDate = hireDate;
		this.jobId = jobId;
	}//괄호안에 순서가 다르면 오류날수있음 

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", salary=" + salary + ", hireDate=" + hireDate + ", jobId=" + jobId + "]";
	}

}
