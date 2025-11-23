package com.spring.learn.springbootintro.service;

import com.spring.learn.springbootintro.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);

    List<Employee> getAllEmployee();

    Employee getEmployee(String id);

    String deleteEmployeeById(String id);
}
