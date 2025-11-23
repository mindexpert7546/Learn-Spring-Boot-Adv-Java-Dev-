package com.spring.learn.springbootintro.controller;

import com.spring.learn.springbootintro.model.Employee;
import com.spring.learn.springbootintro.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/employee")
public class EmployeeV2Contoller {

    @Autowired
    EmployeeService employeeService;

    @PostMapping()
    public Employee save(@RequestBody Employee employee){
        return employee;
    }
}
