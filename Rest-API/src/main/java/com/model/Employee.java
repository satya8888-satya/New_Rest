package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
private int empid;
private String ename;
private String desg;
private String address;
private String dept;
private double salary;
public Employee() {
	super();
}
public Employee(int empid, String ename, String desg, String address, String dept, double salary) {
	super();
	this.empid = empid;
	this.ename = ename;
	this.desg = desg;
	this.address = address;
	this.dept = dept;
	this.salary = salary;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getDesg() {
	return desg;
}
public void setDesg(String desg) {
	this.desg = desg;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", ename=" + ename + ", desg=" + desg + ", address=" + address + ", dept="
			+ dept + ", salary=" + salary + "]";
}

}
