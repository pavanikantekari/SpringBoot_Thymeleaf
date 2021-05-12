package com.ojas.app.service;

import java.util.List;

import com.ojas.app.model.Employee;

public interface EmployeeService {
	public List<Employee> findAll();

	public void save(Employee theEmployee);

	public void deleteById(Long theId);

}
