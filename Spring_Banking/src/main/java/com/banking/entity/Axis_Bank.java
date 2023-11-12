package com.banking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Axis_Bank {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private long acc_no;
private String fname;
private String lname;
private String city;
private String state;
private long mobile;
private String status;
private double balance;
public Axis_Bank() {
	super();
}
public Axis_Bank(long acc_no, String fname, String lname, String city, String state, long mobile, String status) {
	super();
	this.acc_no = acc_no;
	this.fname = fname;
	this.lname = lname;
	this.city = city;
	this.state = state;
	this.mobile = mobile;
	this.status = status;
}
public long getAcc_no() {
	return acc_no;
}
public void setAcc_no(long acc_no) {
	this.acc_no = acc_no;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "Axis_Bank [acc_no=" + acc_no + ", fname=" + fname + ", lname=" + lname + ", city=" + city + ", state="
			+ state + ", mobile=" + mobile + ", status=" + status + "]";
}



	
}
