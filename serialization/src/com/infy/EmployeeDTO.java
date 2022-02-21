package com.infy;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String empId;
	private String name;
	private String designation;
	transient private int jobLevel;
    private Address addr;


	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getJobLevel() {
		return jobLevel;
	}

	public void setJobLevel(int jobLevel) {
		this.jobLevel = jobLevel;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public EmployeeDTO(String empId, String name, String designation, int jobLevel) {
		super();
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.jobLevel = jobLevel;
	}

    public EmployeeDTO(String empId, String name, String designation, int jobLevel,Address addr) {
		super();
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.addr = addr;
		this.jobLevel = jobLevel;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [empId=" + empId + ", name=" + name + ", designation=" + designation + ", jobLevel="
				+ jobLevel + "]";
	}

}
