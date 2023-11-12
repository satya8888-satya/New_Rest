package com.modellayer;

import jakarta.persistence.Entity;

@Entity
public class ModelClass {
	private int empid;
	private String name;
	private String desg;
	private String dept;
	private Double salary;
	public ModelClass() {
		super();
	}
	public ModelClass(int empid, String name, String desg, String dept, Double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.desg = desg;
		this.dept = dept;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "ModelClass [empid=" + empid + ", name=" + name + ", desg=" + desg + ", dept=" + dept + ", salary="
				+ salary + "]";
	}
	
	
	

}
