package com.example.baithispringboot.api;

import com.example.baithispringboot.entity.Employee;
import com.example.baithispringboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("api/v1/employees")
public class EmployeeApi {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> findAll(){
        return ResponseEntity.ok(employeeService.findAllEmployees());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Employee> save(@RequestBody Employee district){
        return ResponseEntity.ok(employeeService.createEmployees(district));
    }
}
