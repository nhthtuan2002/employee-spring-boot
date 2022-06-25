package com.example.baithispringboot.service;

import com.example.baithispringboot.entity.Employee;
import com.example.baithispringboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee createEmployees(Employee employee) {
        return employeeRepository.save(employee);
    }
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }
}
