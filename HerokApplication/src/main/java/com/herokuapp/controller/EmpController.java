package com.herokuapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.herokuapp.entity.Employee;
import com.herokuapp.repo.EmpRepo;
import com.herokuapp.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	private EmpService empservice;

	@Autowired
	private EmpRepo emprepo;

	@PostMapping("/save")
	public ResponseEntity<String> saveEmp(@RequestBody Employee emp) {
		System.out.println(emp.getEmpname());
		if (emprepo.existsByEmpname(emp.getEmpname())) {

			return new ResponseEntity<String>("name already exist", HttpStatus.CREATED);
		} else {
			empservice.addEmployee(emp);
			return new ResponseEntity<String>("emp data saved successfully", HttpStatus.CREATED);
		}
	}

	@GetMapping("/getall")
	public List<Employee> gettingEmp() {

		List<Employee> emp1 = empservice.getEmployee();
		return emp1;

	}

}
