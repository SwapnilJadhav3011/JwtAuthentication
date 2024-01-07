package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employees)
	{
		return employeeService.saveEmployee(employees);
	}
	
	@GetMapping("/employees")
	public List<Employee> fetchAllEmployee()
	{
		return employeeService.fetchAllEmployee();
	}
	
	@GetMapping("/employees/{id}")
	public Employee fetchEmployeeById(@PathVariable("id") Long id)
	{
		return employeeService.fetchEmployeeById(id);
	}
	
	
	@DeleteMapping("/employees/{id}")
	public String deleteEmployeeById(@PathVariable("id") Long id)
	{
		employeeService.deleteEmployeeById(id);
		return "Deleted....!!!!";
	}
}
