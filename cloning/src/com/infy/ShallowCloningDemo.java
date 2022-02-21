package com.infy;


class Employee1 implements Cloneable{

	private int empId;
	private String empName;
	private Department1 dept;

	public Employee1() {
		super();
	}

	public Employee1(int empId, String empName, Department1 dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
	}

    protected Object clone() throws CloneNotSupportedException {
		return super.clone();
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

	public Department1 getDept() {
		return dept;
	}

	public void setDept(Department1 dept) {
		this.dept = dept;
	}

}


class Department1 {
	private String deptName;

	public Department1(String deptName) {
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
class ShallowCloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee1 emp1 = new Employee1(1002, "John", new Department1("ETA"));
		
		Employee1 emp2 = (Employee1) emp1.clone();
			
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
