package com.infy;


class Employee2 implements Cloneable{

	private int empId;
	private String empName;
	private Department2 dept;

	public Employee2() {
		super();
	}

	public Employee2(int empId, String empName, Department2 dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
	}

    //deep copy
	protected Object clone() throws CloneNotSupportedException {
		Employee2 emp2 = (Employee2)super.clone();
		emp2.setDept((Department2)emp2.getDept().clone());   
		return emp2;
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

	public Department2 getDept() {
		return dept;
	}

	public void setDept(Department2 dept) {
		this.dept = dept;
	}

}


class Department2 implements Cloneable{
	private String deptName;

	public Department2(String deptName) {
		super();
		this.deptName = deptName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	//deep copy
	protected Object clone() throws CloneNotSupportedException {
	    return super.clone();
	}
	
}
class DeepCloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee2 emp1 = new Employee2(1002, "John", new Department2("ETA"));
		
		Employee2 emp2 = (Employee2) emp1.clone();
			
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

