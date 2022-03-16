package com.prod;
// 컨트롤 클릭하면 어디서 오는지 알수있음
public class EmployeeExample {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmployeeId(100);
//		e1.employeeId = 100;
		e1.setemployeeName("김사원");
//		e1.employeeName = "황좌";
		e1.setdepartment("개발부");
//		e1.department = "개발부";
		e1.setjob("월급계산");
//		e1.salary = 1000000;
		e1.setSalary(100000);
		
		
		System.out.println(e1.getEmployeeName() + "의 부서는 " //
				+e1.getdepartment()//
				+" 직무는 " + e1.getjob() +" 이고 "//
				+" 급여는 " + e1.getSalary() +"입니다");
		
		System.out.println(e1.getEmpInfo());
		
		Employee e2 =new Employee();
		e2.setEmployeeId(101);
		e2.setemployeeName("김좌");
		e2.setdepartment("총무부");
		e2.setjob("비품구매");
		e2.setSalary(2000000);
		
		
		System.out.println(e2.getEmpInfo());
				
		System.out.println(e1.getSalary() + "입니다");
	}

}
