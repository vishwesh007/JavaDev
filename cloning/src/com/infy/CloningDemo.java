package com.infy;

class Employee {

	private int empId;
	private String empName;
	private Department dept;

	public Employee() {
		super();
	}

	public Employee(int empId, String empName, Department dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
	}

	public static Employee copyEmployee(Employee emp) {
		Employee obj = new Employee();
		obj.setEmpId(emp.getEmpId());
		obj.setEmpName(emp.getEmpName());
		obj.setDept(emp.getDept());
		return obj;
	}
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

}


class Department {
	private String deptName;

	public Department(String deptName) {
		super();
		this.deptName = deptName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
}
class CloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp1 = new Employee(1002, "John", new Department("ETA"));
		
		//Employee emp2 = emp1;

		Employee emp2 = Employee.copyEmployee(emp1);
			
		System.out.println("Employee name before change");
		System.out.println(emp1.getEmpName());
		System.out.println(emp2.getEmpName());
		
		emp2.setEmpName("Robert");
		
		System.out.println("Employee name after change");
		System.out.println(emp1.getEmpName());
		System.out.println(emp2.getEmpName());

		System.out.println("Department name before change");
		System.out.println(emp1.getDept().getDeptName());
		System.out.println(emp2.getDept().getDeptName());
		
		emp2.getDept().setDeptName("HR");
		
		System.out.println("Department name after change");
		System.out.println(emp1.getDept().getDeptName());
		System.out.println(emp2.getDept().getDeptName());

	}

}
