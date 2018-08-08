package com.swopnil.demo.repository;

import com.swopnil.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository  extends JpaRepository<Employee,Long> {
    public Employee getById(long id);
}
