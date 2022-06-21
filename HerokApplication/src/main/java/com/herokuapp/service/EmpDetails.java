package com.herokuapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.herokuapp.entity.Employee;

@Service
public interface EmpDetails {

	public void addEmployee(Employee emp);

	public List<Employee> getEmployee();
	// public void existEmployee();

}
