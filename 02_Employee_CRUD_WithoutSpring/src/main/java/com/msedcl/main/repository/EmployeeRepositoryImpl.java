package com.msedcl.main.repository;

import java.util.ArrayList;
import java.util.List;

import com.msedcl.main.domain.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	private List<Employee> employeeList = new ArrayList<>();

	@Override
	public boolean addNewEmployee(Employee employee) {
		return employeeList.add(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee existingEmployee = getEmployeeByEmployeeId(employee.getEmployeeId());
		if (existingEmployee != null) {
			existingEmployee.setName(employee.getName());
			existingEmployee.setSalary(employee.getSalary());
			return existingEmployee;
		}
		return null;
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		Employee existingEmployee = getEmployeeByEmployeeId(employeeId);
		if (existingEmployee != null) {
			return employeeList.remove(existingEmployee);
		}
		return false;
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		for (Employee employee : employeeList) {
			if (employee.getEmployeeId() == employeeId)
				return employee;
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeList;
	}

}
