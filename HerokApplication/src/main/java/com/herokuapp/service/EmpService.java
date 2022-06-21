package com.herokuapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.herokuapp.entity.Employee;
import com.herokuapp.repo.EmpRepo;

@Service
public class EmpService implements EmpDetails {
	@Autowired
	private EmpRepo repo;

	@Override
	public void addEmployee(Employee emp) {
		repo.save(emp);

	}

	@Override
	public List<Employee> getEmployee() {
		return repo.findAll();
	}

//	public boolean get(Employee em) {
//		boolean t = repo.existsByEmpname(em.getEmpname());
//		return t;
//	}

}
