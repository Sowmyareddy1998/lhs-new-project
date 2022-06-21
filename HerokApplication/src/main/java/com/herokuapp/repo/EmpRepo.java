package com.herokuapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.herokuapp.entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {

	boolean existsByEmpname(String empname);
}
