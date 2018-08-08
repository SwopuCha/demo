package com.swopnil.demo.service;

import com.swopnil.demo.model.Employee;

import java.util.List;

public interface EmployeeService {
public void save(Employee employee);
public List<Employee> employeeList();
public Employee getById(long id);
public void delete(Employee employee);
}