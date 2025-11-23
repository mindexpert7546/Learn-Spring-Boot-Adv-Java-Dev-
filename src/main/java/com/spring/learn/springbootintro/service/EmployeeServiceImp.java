package com.spring.learn.springbootintro.service;

import com.spring.learn.springbootintro.exceptions.EmployeeNotFoundException;
import com.spring.learn.springbootintro.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImp implements EmployeeService{

    List<Employee> employeeList = new ArrayList<>();
    @Override
    public Employee save(Employee employee) {
        if(employee.getEmployeeId() == null || employee.getEmaiId().isEmpty()){
            employee.setEmployeeId(UUID.randomUUID().toString());
        }

        employeeList.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeList;
    }

    @Override
    public Employee getEmployee(String id) {
        return employeeList.stream().filter(employee -> employee.getEmployeeId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("" + "Employee Not found with ID : " + id));
    }

    @Override
    public String deleteEmployeeById(String id) {

        Employee employee = employeeList.stream().filter(e -> e.getEmployeeId().equalsIgnoreCase(id))
                .findFirst().get();

        employeeList.remove(employee);

        return "Employee Deleted with id: " + id;
    }


}
