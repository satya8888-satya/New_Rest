package com.newcrud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="studnt_tbl_01")
public class Student {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String name;
	private String branch;
	private String address;
	private double fee;
	public Student() {
		super();
	}
	public Student(int id, String name, String branch, String address, double fee) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.address = address;
		this.fee = fee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	} 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", address=" + address + ", fee=" + fee
				+ "]";
	}
	
	

}
