package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employees);

	public List<Employee> fetchAllEmployee();

	public Employee fetchEmployeeById(Long id);

	public void deleteEmployeeById(Long id);

}
