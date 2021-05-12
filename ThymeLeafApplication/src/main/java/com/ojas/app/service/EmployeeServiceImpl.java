package com.ojas.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.app.dao.EmployeeDao;
import com.ojas.app.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeedao;

	public List<Employee> findAll() {
		return employeedao.findAll();
	}

	@Override
	public void save(Employee theEmployee) {
		employeedao.save(theEmployee);
	}

	@Override
	public void deleteById(Long theId) {
		employeedao.deleteById(theId);
	}
}
