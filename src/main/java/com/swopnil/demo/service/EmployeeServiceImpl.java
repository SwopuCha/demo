package com.swopnil.demo.service;

import com.swopnil.demo.model.Employee;
import com.swopnil.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void save(Employee employee) {
        employeeRepository.saveAndFlush(employee);
    }

    @Override
    public List<Employee> employeeList() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getById(long id) {
        return employeeRepository.getById(id);
    }

    @Override
    public void delete(Employee employee) {
    employeeRepository.delete(employee);
    }
}
