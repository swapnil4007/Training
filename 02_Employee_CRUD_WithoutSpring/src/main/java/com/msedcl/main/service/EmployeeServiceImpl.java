package com.msedcl.main.service;

import java.util.List;

import com.msedcl.main.domain.Employee;
import com.msedcl.main.repository.EmployeeRepository;
import com.msedcl.main.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

	@Override
	public boolean addNewEmployee(Employee employee) {
		System.out.println("EmployeeService :: addNewEmployee");
		return employeeRepository.addNewEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		System.out.println("EmployeeService :: updateEmployee");
		return employeeRepository.updateEmployee(employee);
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		System.out.println("EmployeeService :: deleteEmployee");
		return employeeRepository.deleteEmployee(employeeId);
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		System.out.println("EmployeeService :: getEmployeeByEmployee");
		return employeeRepository.getEmployeeByEmployeeId(employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		System.out.println("EmployeeService :: getAllEmployees");
		return employeeRepository.getAllEmployees();
	}

}
