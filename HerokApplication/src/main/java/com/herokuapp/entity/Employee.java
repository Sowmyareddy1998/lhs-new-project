package com.herokuapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String empname;
	private String designation;
	private String address;
	private int salary;

	public int getId() {
		return id;
	}

	public String getEmpname() {
		return empname;
	}

	public String getDesignation() {
		return designation;
	}

	public String getAddress() {
		return address;
	}

	public int getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(int id, String empname, String designation, String address, int salary) {
		super();
		this.id = id;
		this.empname = empname;
		this.designation = designation;
		this.address = address;
		this.salary = salary;
	}

	public Employee() {
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empname=" + empname + ", designation=" + designation + ", address=" + address
				+ ", salary=" + salary + "]";
	}

}
