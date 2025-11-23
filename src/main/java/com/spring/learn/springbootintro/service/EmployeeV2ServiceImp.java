package com.spring.learn.springbootintro.service;

import com.spring.learn.springbootintro.entity.EmployeeEntity;
import com.spring.learn.springbootintro.model.Employee;
import com.spring.learn.springbootintro.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeV2ServiceImp implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        if(employee.getEmployeeId() == null || employee.getEmaiId().isEmpty()){
            employee.setEmployeeId(UUID.randomUUID().toString());
        }

        EmployeeEntity entity = new EmployeeEntity();
        BeanUtils.copyProperties(employee, entity);
        employeeRepository.save(entity);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return List.of();
    }

    @Override
    public Employee getEmployee(String id) {
        return null;
    }

    @Override
    public String deleteEmployeeById(String id) {
        return "";
    }
}
